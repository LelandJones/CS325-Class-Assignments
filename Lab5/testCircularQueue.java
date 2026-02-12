package Lab5;

/**
 * testCircularQueue
 * fall 2025
 * 
 * @author jlehman
 *         sample test program for CircularCharQueue
 * 
 */
public class testCircularQueue {

    public static void main(String[] args) {

        // create instance of CirclularQueue
        CircularCharQueue q = new CircularCharQueue();

        // *** Memory Diagram and Logical Diagram (#1) ***

        // display empty queue, test delete from empty queue
        System.out.println(q); // CQ: empty queue
        q.dequeue(); // empty queue no change
        System.out.println(q); // CQ: empty queue
        System.out.println("Front: " + q.front()); // Front: ?
        System.out.println("Back: " + q.back()); // Back ?
        System.out.println();

        // add items to queue
        q.enqueue('A');
        System.out.println(q); // CQ: A
        System.out.println("Front: " + q.front()); // Front: A
        System.out.println("Back: " + q.back()); // Back A
        System.out.println("Size: " + q.size()); // Size: 1
        System.out.println();

        // *** Memory Diagram and Logical Diagram (#2) ***

        q.enqueue('B');
        // *** Memory Diagram and Logical Diagram (#3) ***

        q.enqueue('C');
        // *** Memory Diagram and Logical Diagram (#4) ***

        q.enqueue('D');
        q.enqueue('E');
        // *** Memory Diagram and Logical Diagram (#5) ***

        System.out.println(q); // CQ: A B C D E
        System.out.println("Front: " + q.front()); // Front: A
        System.out.println("Back: " + q.back()); // Back E
        System.out.println("Size: " + q.size()); // Size: 5
        System.out.println();

        // display all values in queue
        int count = 0;
        while (count < q.size()) {
            System.out.println("Queue Item: " + count + ": " + q.front());
            q.next();
            count++;
        }
        System.out.println();

        // rotate queue with .next()
        System.out.println(q); // CQ: A B C D E
        q.next();
        System.out.println(q); // CQ: B C D E A
        q.enqueue('X');

        // *** Memory Diagram and Logical Diagram (#6) ***

        System.out.println(q); // CQ: B C D E A X
        q.next();
        System.out.println(q); // CQ: C D E A X B

        System.out.println("Front: " + q.front()); // Front: C
        System.out.println("Back: " + q.back()); // Back B

        q.dequeue();
        System.out.println(q); // CQ: D E A X B

        // *** Memory Diagram and Logical Diagram (#7) ***

        System.out.println("Size: " + q.size()); // Size: 5
        System.out.println();

        // remove all items from queue
        while (!q.isEmpty()) {
            System.out.println(q);
            q.dequeue();
        }

        System.out.println(q);
        System.out.println("Front: " + q.front()); // Front: ?
        System.out.println("Back: " + q.back()); // Back ?
        System.out.println("Size: " + q.size()); // Size: 0
        System.out.println(q); // CQ: empty queue
        System.out.println();

        // *** Memory Diagram and Logical Diagram (#8) ***

        // test adding to empty queue
        q.enqueue('A');
        System.out.println(q); // CQ: A
        System.out.println("Front: " + q.front()); // Front: A
        System.out.println("Back: " + q.back()); // Back A
        System.out.println("Size: " + q.size()); // Size: 1

        q.enqueue('B');
        q.enqueue('C');
        q.enqueue('D');
        // *** Memory Diagram and Logical Diagram (#9) ***

        
        q.spin();
        System.out.println(q);
        // *** Memory Diagram and Logical Diagram (#10) ***
        // note: write down the random number you used for the spin

    }// main

}// class