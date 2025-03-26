import java.util.*;

public class NFA {
    private Set<String> states; // Set of states
    private String initialState; // Initial state
    private Set<String> finalStates; // Set of final states
    private Map<String, Map<Character, Set<String>>> transitions; // Regular transitions
    private Map<String, Set<String>> epsilonTransitions; // Epsilon transitions

    public NFA(String[] stateList) {
        this.states = new HashSet<>(Arrays.asList(stateList));
        this.finalStates = new HashSet<>();
        this.transitions = new HashMap<>();
        this.epsilonTransitions = new HashMap<>();
        
        for (String state : stateList) {
            transitions.put(state, new HashMap<>());
            epsilonTransitions.put(state, new HashSet<>());
        }
    }

    public void addTransition(String currentState, char label, String nextState) {
        if (!states.contains(currentState) || !states.contains(nextState)) {
            throw new IllegalArgumentException("Invalid states in transition");
        }
        
        // Get the transition map for the current state or create it if it does not exist
        transitions.putIfAbsent(currentState, new HashMap<>());
        
        // Get the set of destination states for the symbol or create it if it does not exist
        transitions.get(currentState).putIfAbsent(label, new HashSet<>());
    
        // Add the destination state to the transition set
        transitions.get(currentState).get(label).add(nextState);
    }
    
    public void addEpsilonTransition(String currentState, String nextState) {
        if (!states.contains(currentState) || !states.contains(nextState)) {
            throw new IllegalArgumentException("Invalid states in epsilon transition");
        }
        epsilonTransitions.get(currentState).add(nextState);
    }

    public void addFinalState(String state) {
        if (!states.contains(state)) {
            throw new IllegalArgumentException("Invalid state");
        }
        finalStates.add(state);
    }

    public void setInitialState(String state) {
        if (!states.contains(state)) {
            throw new IllegalArgumentException("Invalid initial state");
        }
        this.initialState = state;
    }

    public boolean accept(String input) {
        if (initialState == null) {
            return false;
        }
        
        Set<String> currentStates = epsilonClosure(Set.of(initialState));
        
        for (char c : input.toCharArray()) {
            Set<String> nextStates = new HashSet<>();
            for (String state : currentStates) {
                if (transitions.containsKey(state) && transitions.get(state).containsKey(c)) {
                    nextStates.addAll(transitions.get(state).get(c));
                }
            }
            currentStates = epsilonClosure(nextStates);
        }
        
        for (String state : currentStates) {
            if (finalStates.contains(state)) {
                return true;
            }
        }
        return false;
    }
    
    private Set<String> epsilonClosure(Set<String> states) {
        Set<String> closure = new HashSet<>(states);
        Stack<String> stack = new Stack<>();
        stack.addAll(states);
        
        while (!stack.isEmpty()) {
            String state = stack.pop();
            for (String nextState : epsilonTransitions.getOrDefault(state, new HashSet<>())) {
                if (!closure.contains(nextState)) {
                    closure.add(nextState);
                    stack.push(nextState);
                }
            }
        }
        
        return closure;
    }
}