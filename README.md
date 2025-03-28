# **Construction and Implementation of an Interpreter Based on Non-Deterministic Finite Automata**

## **Project Overview**
The goal of this project is to implement a **Non-Deterministic Finite Automaton (NFA)** capable of recognizing specific languages based on predefined transition rules. The NFA is constructed using a set of states, an initial state, final states, and transition functions, including epsilon transitions for added flexibility.

As part of the assignment, each team member designed a unique NFA specification that recognizes a specific language. These specifications are stored in separate files:  
- `nfa-member1.txt`  
- `nfa-member2.txt`  
- `nfa-member3.txt`  

To ensure correctness, we wrote individual test cases for each NFA, verifying that they accept or reject input strings as expected.

This assignment provided valuable hands-on experience in formal language processing and automata implementation. By defining, testing, and refining our NFAs, we reinforced our understanding of **finite state machines** and their real-world applications.

## **Members' Contribution**
All team members collaborated on implementing the `NFA.java` class, ensuring that the automaton correctly processes input strings according to the given transition rules. We designed its structure, defined the states and transitions, and handled epsilon transitions appropriately. Throughout development, we tested multiple cases to verify that the NFA functioned as expected.

Additionally, each member was responsible for defining and testing a specific DFA specification:

- **Pau**: Developed `nfa-member1.txt`, implementing an **NFA** that recognizes binary strings that **contain the substring `01`** (using 3 states).  
- **Mohamed**: Developed `nfa-member2.txt`, implementing an **NFA** that recognizes binary strings where **the symbol that appears three positions before the end is `1`** (using 4 states).  
- **Joel**: Developed `nfa-member3.txt`, implementing an **NFA** that recognizes binary strings that **contain an even number of `0`s or exactly two `1`s** (using 6 states).   

  

Each NFA was tested individually using predefined input cases to ensure that they correctly accept or reject strings.
