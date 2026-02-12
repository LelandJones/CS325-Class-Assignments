package Lab5;

/*
    Node.java
	Fall 2025
	Lehman
	
	Demonstrates basic data node for linked-list structures
	
*/
public class Node {

    // public data allows direct access ie. instance.data = 'A';
    public char data;
    public Node next;

    // default constructor
    public Node() {
        data = '?';
        next = null;
    }

    // alternate constructor
    public Node(char value, Node n) {
        data = value;
        next = n;
    }

}