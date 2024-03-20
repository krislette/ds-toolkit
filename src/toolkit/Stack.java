package toolkit;

import javax.swing.JOptionPane;

public class Stack {

    private int intMaxSize;
    private int[] arrStack; // I used an array implementation for the stack.
    private int intTop;
    
    public Stack(int intSize) {
        this.intMaxSize = intSize;
        this.arrStack = new int[intMaxSize];
        this.intTop = -1;
    }
    
    public void push(int intElement) {
        if (isFull()) {
            JOptionPane.showMessageDialog(null, 
                                          "Cannot push element.",
                                          "Stack Overflow",
                                          JOptionPane.WARNING_MESSAGE);    
            return;
        }
        
        intTop++;
        arrStack[intTop] = intElement;
        JOptionPane.showMessageDialog(null, intElement + " is successfully pushed into the stack.");
    }
    
    public int pop() {
        if (isEmpty()) {
            JOptionPane.showMessageDialog(null, 
                                          "Cannot pop element.",
                                          "Stack Underflow",
                                          JOptionPane.WARNING_MESSAGE);
            return -1;
        }
        
        int intPoppedElement = arrStack[intTop];
        intTop--;
        JOptionPane.showMessageDialog(null, 
                                      "Stack Size: " + intMaxSize 
                                      + "\nElement Count: " + (intTop + 1) 
                                      + "\n\n" + intPoppedElement + " is successfully popped from the stack.");
        
        return intPoppedElement;
    }
    
    public void changeElement(int intOldValue, int intNewValue) {
        int intIndex = -1;
        
        for (int i = 0; i <= intTop; i++) {
            if (arrStack[i] == intOldValue) {
                intIndex = i;
                break;
            }
        }
        
        if (intIndex == -1) {
            JOptionPane.showMessageDialog(null, 
                                          intOldValue + " doesn't exist within the stack.", 
                                          "Change Failed", 
                                          JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        arrStack[intIndex] = intNewValue;
        JOptionPane.showMessageDialog(null, intOldValue + " is successfully changed into " + intNewValue + ".");
    }
    
    public StringBuilder display() {
        StringBuilder sbStackString = new StringBuilder();

        sbStackString.append("[");
        for (int i = 0; i <= intTop; i++) {
            sbStackString.append(arrStack[i]);
            if (i < intTop) {
                sbStackString.append(", ");
            }
        }
        sbStackString.append("]");

        return sbStackString;
    }
    
    public void clear() {
        intTop = -1;
    }
    
    public boolean isFull() {
        return intTop == intMaxSize - 1;
    }
    
    public boolean isEmpty() {
        return intTop == -1;
    }

    public int getMaxSize() {
        return intMaxSize;
    }
    
    public int getTop() {
        return intTop;
    }
    
}