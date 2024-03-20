package toolkit;

public class BinaryTree {

    public Node nodeRoot;
 
    public BinaryTree() {
        nodeRoot = null;
    }
 
    public Node insert(Node nodeNew, int intKey) {
        // If the tree is empty, return a new node
        if (nodeNew == null) {
            nodeNew = new Node(intKey);
            return nodeNew;
        }
 
        if (intKey < nodeNew.intData) {
            nodeNew.nodeLeft = insert(nodeNew.nodeLeft, intKey);
        } else if (intKey > nodeNew.intData) {
            nodeNew.nodeRight = insert(nodeNew.nodeRight, intKey);
        }
 
        return nodeNew;
    }

    public Node delete(Node nodeRoot, int intKey) {
        if (nodeRoot == null) return nodeRoot;
 
        if (nodeRoot.intData > intKey) {
            nodeRoot.nodeLeft = delete(nodeRoot.nodeLeft, intKey);
            return nodeRoot;
        } else if (nodeRoot.intData < intKey) {
            nodeRoot.nodeRight = delete(nodeRoot.nodeRight, intKey);
            return nodeRoot;
        }
 
        if (nodeRoot.nodeLeft == null) {
            Node temp = nodeRoot.nodeRight;
            return temp;
        } else if (nodeRoot.nodeRight == null) {
            Node temp = nodeRoot.nodeLeft;
            return temp;
        } else {
            Node succParent = nodeRoot;
            Node succ = nodeRoot.nodeRight;
            
            while (succ.nodeLeft != null) {
                succParent = succ;
                succ = succ.nodeLeft;
            }
 
            if (succParent != nodeRoot) succParent.nodeLeft = succ.nodeRight;
            else succParent.nodeRight = succ.nodeRight;
 
            nodeRoot.intData = succ.intData;
 
            return nodeRoot;
        }
    }

    public Node search(Node nodeRoot, int intKey) {
        if (nodeRoot == null || nodeRoot.intData == intKey) return nodeRoot;
        if (nodeRoot.intData < intKey) return search(nodeRoot.nodeRight, intKey);

        return search(nodeRoot.nodeLeft, intKey);
    }

    public StringBuilder display() {
        StringBuilder sbTreeString = new StringBuilder();
        displaySetNotation(nodeRoot, sbTreeString);
        
        return sbTreeString;
    }
    
    public StringBuilder displayStructure() {
        StringBuilder sbTreeStructureString = new StringBuilder();
        StringBuilder sbParentString = new StringBuilder();
        StringBuilder sbLeafString = new StringBuilder();
        
        findParentNodes(nodeRoot, sbParentString);
        findLeafNodes(nodeRoot, sbLeafString);
        
        sbTreeStructureString.append("\nParent Node(s): ").append(sbParentString);
        sbTreeStructureString.append("\nLeaf Node(s): ").append(sbLeafString);
        sbTreeStructureString.append("\nLevel: ").append(findTreeLevel(nodeRoot) - 1);
        
        return sbTreeStructureString;
    }

    private void findParentNodes(Node node, StringBuilder sbTreeString) {
        if (node == null || (node.nodeLeft == null && node.nodeRight == null)) return;
    
        sbTreeString.append(node.intData).append(" ");
    
        findParentNodes(node.nodeLeft, sbTreeString);
        findParentNodes(node.nodeRight, sbTreeString);
    }
    
    private void findLeafNodes(Node node, StringBuilder sbTreeString) {
        if (node == null) return;
    
        if (node.nodeLeft == null && node.nodeRight == null) {
            sbTreeString.append(node.intData).append(" ");
        }
    
        findLeafNodes(node.nodeLeft, sbTreeString);
        findLeafNodes(node.nodeRight, sbTreeString);
    }
    
    private void displaySetNotation(Node node, StringBuilder sbTreeString) {
        if (node == null) return;
    
        sbTreeString.append("{").append(node.intData);
    
        if (node.nodeLeft != null || node.nodeRight != null) {
            sbTreeString.append(" -> ");

            if (node.nodeLeft != null) {
                displaySetNotation(node.nodeLeft, sbTreeString);
            } else {
                sbTreeString.append("null");
            }
    
            sbTreeString.append(", ");
    
            if (node.nodeRight != null) {
                displaySetNotation(node.nodeRight, sbTreeString);
            } else {
                sbTreeString.append("null");
            }
        }
    
        sbTreeString.append("}");
    }

    private int findTreeLevel(Node node) {
        if (node == null) {
            return 0;
        } else {
            int leftLevel = findTreeLevel(node.nodeLeft);
            int rightLevel = findTreeLevel(node.nodeRight);

            if (leftLevel > rightLevel) return (leftLevel + 1);
            else return (rightLevel + 1);
        }
    }
    
    public boolean isEmpty() {
        return nodeRoot == null;
    }
    
    public void clear() {
        nodeRoot = null;
    }
 
}

class Node {

    public int intData;
    public Node nodeLeft, nodeRight;
 
    public Node(int item) {
        intData = item;
        nodeLeft = nodeRight = null;
    }

}