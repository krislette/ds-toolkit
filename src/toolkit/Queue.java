package toolkit;

import javax.swing.JOptionPane;

public class Queue {

    private static final int MAX_SIZE = 1000;

    private Integer[] arrQueue;
    private int intFront;
    private int intRear;

    public Queue() {
        this.arrQueue = new Integer[MAX_SIZE];
        this.intFront = 0; // Initialize front to 0
        this.intRear = -1; // Initialize rear to -1 (empty queue)
    }

    public void enqueue(int intItem) {
        if (isFull()) {
            JOptionPane.showMessageDialog(null,
                                          "Cannot enqueue.",
                                          "Queue Full",
                                          JOptionPane.WARNING_MESSAGE);
            return;
        }

        intRear++;
        arrQueue[intRear] = intItem;
        JOptionPane.showMessageDialog(null, intItem + " is successfully enqueued.");
    }

    public int dequeue() {
        if (isEmpty()) {
            JOptionPane.showMessageDialog(null,
                                          "Cannot dequeue.",
                                          "Queue Empty",
                                          JOptionPane.WARNING_MESSAGE);
            return -1;
        }

        int intItem = arrQueue[intFront];
        arrQueue[intFront] = null;
        intFront++;

        JOptionPane.showMessageDialog(null, intItem + " is successfully dequeued.");

        return intItem;
    }

    public int front() {
        if (isEmpty()) {
            JOptionPane.showMessageDialog(null,
                                          "Queue is empty.",
                                          "Queue Empty",
                                          JOptionPane.WARNING_MESSAGE);
            return -1;
        }
        return arrQueue[intFront];
    }

    public int rear() {
        if (isEmpty()) {
            JOptionPane.showMessageDialog(null,
                                          "Queue is empty.",
                                          "Queue Empty",
                                          JOptionPane.WARNING_MESSAGE);
            return -1;
        }
        return arrQueue[intRear];
    }

    public StringBuilder display() {
        StringBuilder sbQueueString = new StringBuilder();

        sbQueueString.append("Front [");
        for (int i = 0; i <= intRear; i++) {
            sbQueueString.append(arrQueue[i] != null ? arrQueue[i] : "null");
            if (i < intRear) {
                sbQueueString.append(", ");
            }
        }
        sbQueueString.append("] Rear");

        return sbQueueString;
    }

    public void clear() {
        for (int i = intFront; i <= intRear; i++) {
            arrQueue[i] = null;
        }
        intFront = 0;
        intRear = -1;
    }

    public boolean isEmpty() {
        return intFront > intRear;
    }

    public boolean isFull() {
        return intRear == MAX_SIZE - 1;
    }

    public int getMaxSize() {
        return MAX_SIZE;
    }

    public int getFrontIndex() {
        return intFront;
    }

    public int getRearIndex() {
        return intRear;
    }

}