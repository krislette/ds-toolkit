/**
 * I customized an array class that contains the following methods:
 * (1) insert(int): Allows the user to insert an element to the array.
 * (2) delete(int): Allows the user to delete an element from the array.
 * (3) search(int): Searches for an element by returning its index, else, -1.
 * (4) isEmpty(): Returns a bool value checking if the array is empty or not.
 * (5) clear(): Clears all the elements of the array.
 * (6) toString(): Override of the original toString() method.
 */
package toolkit;

import javax.swing.JOptionPane;

public class Array {
    
    private static final int DEFAULT_CAPACITY = 1000;
    private int[] arrIntegers;
    private int intSize;

    public Array() {
        arrIntegers = new int[DEFAULT_CAPACITY];
        intSize = 0;
    }

    public void insert(int intValue) {
        if (intSize < arrIntegers.length) {
            arrIntegers[intSize] = intValue;
            intSize++;
        } else {
            JOptionPane.showMessageDialog(null, 
                                          "Cannot insert more elements.",
                                          "Array Full", 
                                          JOptionPane.WARNING_MESSAGE);
        }
    }

    public void delete(int intValue) {
        int intIndex = search(intValue);
        
        if (intIndex != -1) {
            for (int i = intIndex; i < intSize - 1; i++) {
                arrIntegers[i] = arrIntegers[i + 1];
            }
            intSize--;
        }
    }

    public int search(int intValue) {
        for (int i = 0; i < intSize; i++) {
            if (arrIntegers[i] == intValue) {
                return i;
            }
        }
        
        return -1;
    }

    public boolean isEmpty() {
        return intSize == 0;
    }
    
    public void clear() {
        intSize = 0;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("[");
        for (int i = 0; i < intSize; i++) {
            sb.append(arrIntegers[i]);
            if (i < intSize - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        
        return sb.toString();
    }

}