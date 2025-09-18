/*
 * QueueCharArray.java
 * fall 2025
 * prof. lehman
 * 
 * Queue approach has first and last point
 * to first and last elements in array.
 * The variable size is used to denote
 * an empty vs. full queue
 * 
 * Leland Jones
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
		MAX = 5; // default max size
		data = new char[MAX]; // array
		size = 0; // sets queue to empty
		front = 0; // starts front at 0
		back = -1; // -1 since no elements yet
	}

	// alternate constructor
	public QueueCharArray(int max) {
		MAX = max; // user sets max size
		data = new char[MAX]; // array
		size = 0; // sets queue to empty
		front = 0; // starts front at 0
		back = -1; // -1 since no elements yet
	}
	public void clear() {
		size = 0; // no elements
		front = 0; // reset front
		back = -1; // reset back
	}

	// add to back of queue
	public void add(char v) {
		if (!full()) {
            back = (back + 1) % MAX; // wrap-around
            data[back] = v; // add to back
            size++; // increase size
			}
    }

	// see if queue is empty
	public boolean empty() {
		return size == 0;
	}

	// see if queue is full
	public boolean full() {
		return size == MAX;
	}

	// return element from front of queue
	public char front() {
		if (empty()) {
			return '?'; // returns a placeholder if it is empty
		}
		return data[front];
	}

	// remove element from front of queue
	public boolean remove() {
		if (empty()) {
			return false; // doesnt remove if empty
		}
		front = (front + 1) % MAX; // moves front forward with wrap-around
		size--; // decrease size
		return true;
	}

	// gets current size of queue
	public int size() {
		return size;
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
