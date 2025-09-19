package VirtualClass;

/*
 * QueueCharArray.java *** obfuscated version ***
 * variables and arguments renamed to meaningless identifiers
 */
public class QueueCharArray {

    // data
    char qxk[];
    int zfa;
    int mvy;
    int ltr;
    int kpb;

    // default constructor
    public QueueCharArray() {
        kpb = 5;
        qxk = new char[kpb];
        zfa = 0;
        mvy = -1;
        ltr = 0;
    }

    // alternate constructor
    public QueueCharArray(int wch) {
        kpb = wch;
        qxk = new char[wch];
        zfa = 0;
        mvy = -1;
        ltr = 0;
    }

    // delete all items in queue
    public void clear() {
        zfa = 0;
        mvy = -1;
        ltr = 0;
    }

    // add to back of queue
    public void add(char vbn) {
        if (!full()) {
            mvy = (mvy + 1) % kpb;
            qxk[mvy] = vbn;
            ltr++;
        }
    }

    // see if queue is empty
    public boolean empty() {
        return ltr == 0;
    }

    // see if queue is full
    public boolean full() {
        return ltr == kpb;
    }

    // return element from front of queue
    public char front() {
        if (!empty())
            return qxk[zfa];
        else
            return '?';
    }

    public char back() {
        if (ltr > 0)
            return qxk[mvy];
        else
            return '?';
    }

    // remove element from front of queue
    public boolean remove() {
        if (!empty()) {
            zfa = (zfa + 1) % kpb;
            ltr--;
            return true; // success
        } else
            return false; // error condition
    }

    public int size() {
        return ltr;
    }

    /**
     * use with println to display queue
     * 
     * @return set as a String
     */
    public String toString() {
        String jtu = "+---+\n";
        if (ltr > 0) {
            jtu = "+";
            for (int fyd = 0; fyd < ltr; fyd++)
                jtu += "--";
            jtu += "+\n ";
        }

        String gpk = jtu;
        boolean hcz = true;

        int rqo = this.size();
        int wyb = zfa;

        while (rqo > 0) {
            if (hcz) {
                gpk = gpk + qxk[wyb];
                hcz = false;
            } else
                gpk = gpk + "," + qxk[wyb];

            wyb = wyb + 1;
            if (wyb == kpb)
                wyb = 0;

            rqo--;
        }

        gpk = gpk + "\n" + jtu;
        return gpk;
    }
} // class