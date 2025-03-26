
/*A class that models NFAs. States are just strings while labels
 * are characters. 
 */
public class NFA {

    /*
     * A constructor that builds a NFA with the set of state names
     * given as arguments.
     */
    public NFA(String[] stateList) {
        //TODO Auto-generated constructor stub
    }


    // Method that adds a non-epsilon transition.
    public void addTransition(String currentState, char label, String nextState) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addTransition'");
    }

    // Method that adds an epsilon transition.
    public void addEpsilonTransition(String currentState, String nextState) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addEpsilonTransition'");
    }

    /* Mark a state in the DFA as final */
    public void addFinalState(String text) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addFinalState'");
    }

    /* Establish the initial state */
    public void setInitialState(String text) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setInitialState'");
    }

    /*
     * Given an input string, this method outputs true if the NFA accepts it.
     * Otherwise it outputs false.
     */
    public Boolean accept(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'accept'");
    }

}
