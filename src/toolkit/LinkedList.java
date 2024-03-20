package toolkit;

public class LinkedList {
    
    private Node nodeHead;

    class Node {
        int intData;
        Node nodeNext;
        
        public Node(int intData) {
            this.intData = intData;
            this.nodeNext = null;
        }
    }
    
    public void insert(int intData) {
        Node nodeNew = new Node(intData);
        
        if (nodeHead == null) {
            nodeHead = nodeNew;
        } else {
            Node nodeCurrent = nodeHead;
            while (nodeCurrent.nodeNext != null) {
                nodeCurrent = nodeCurrent.nodeNext;
            }
            nodeCurrent.nodeNext = nodeNew;
        }
    }
    
    public void delete(int intData) {
        if (nodeHead == null) {
            System.out.println("List is empty");
            return;
        }
 
        if (nodeHead.intData == intData) {
            nodeHead = nodeHead.nodeNext;
            return;
        }
   
        Node nodeCurrent = nodeHead;
        Node nodePrevious = null;
        while (nodeCurrent != null && nodeCurrent.intData != intData) {
            nodePrevious = nodeCurrent;
            nodeCurrent = nodeCurrent.nodeNext;
        }
        
        if (nodeCurrent == null) {
            System.out.println("Element not found in the list");
            return;
        }
        nodePrevious.nodeNext = nodeCurrent.nodeNext;
    }
    
    public boolean search(int intData) {
        Node nodeCurrent = nodeHead;
        
        while (nodeCurrent != null) {
            if (nodeCurrent.intData == intData) {
                return true;
            }
            nodeCurrent = nodeCurrent.nodeNext;
        }
        
        return false;
    }
    
    public StringBuilder display() {
        StringBuilder sbListString = new StringBuilder();
        Node nodeCurrent = nodeHead;
        
        sbListString.append("[");
        while (nodeCurrent != null) {
            sbListString.append(nodeCurrent.intData);
            if (nodeCurrent.nodeNext != null) {
                sbListString.append(", ");
            }
            nodeCurrent = nodeCurrent.nodeNext;
        }
        sbListString.append("]");
        
        return sbListString;
    }
    
    public boolean isEmpty() {
        return nodeHead == null;
    }
    
    public void clear() {
        nodeHead = null;
    }
    
}