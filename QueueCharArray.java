/*
 * QueueCharArray.java
 * fall 2025
 * prof. lehman
 * 
 * Queue approach has first and last point
 * to first and last elements in array.
 * The variable size is used to denote
 * an empty vs. full queue
 */
public class QueueCharArray {

	// data
	char data[];
	int front;
	int back;
	int size;
	int MAX;

	// default constructor
	public QueueCharArray() {

	}

	// alternate constructor
	public QueueCharArray(int max) {

	}

	// delete all items in queue
	public void clear() {

	}

	// add to back of queue
	public void add(char v) {

	}

	// see if queue is empty
	public boolean empty() {
		return true;
	}

	// see if queue is full
	public boolean full() {
		return true;
	}

	// return element from front of queue
	public char front() {
		return 'X';
	}

	// remove element from front of queue
	public boolean remove() {
		return true;
	}

	public int size() {
		return -1;
	}

	 /**
     * use with println to display queue
     * 
     * @return set as a String
     */
    public String toString() 
	{
		return "QUEUE";
    }
}// class
