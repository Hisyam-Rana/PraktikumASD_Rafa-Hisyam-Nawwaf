package Jobsheet_14_05062026;

public class BinaryTree19 {
    Node19 root;
    
    public BinaryTree19() {
        root = null;
    }
    
    public boolean isEmpty() {
        return root == null;
    }
    
    public void add(Student19 data) {
        if (isEmpty()) {
            root = new Node19(data);
        } else {
            Node19 current = root;
            while (true) {
                if (data.gpa < current.data.gpa) {
                    if (current.left != null) {
                        current = current.left;
                    } else {
                        current.left = new Node19(data);
                        break;
                    }
                } else if (data.gpa > current.data.gpa) {
                    if (current.right != null) {
                        current = current.right;
                    } else {
                        current.right = new Node19(data);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
    }
    
    public boolean find(double gpa) {
        boolean result = false;
        Node19 current = root;
        while (current != null) {
            if (current.data.gpa == gpa) {
                result = true;
                break;
            } else if (gpa < current.data.gpa) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return result;
    }
    
    public void traversePreOrder(Node19 node) {
        if (node != null) {
            node.data.print();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
    
    public void traverseInOrder(Node19 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.data.print();
            traverseInOrder(node.right);
        }
    }
    
    public void traversePostOrder(Node19 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.data.print();
        }
    }
    
    Node19 getSuccessor(Node19 del) {
        Node19 successor = del.right;
        Node19 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }
    
    public void delete(double gpa) {
        if (isEmpty()) {
            System.out.println("Tree is empty!!");
            return;
        }
        Node19 parent = root;
        Node19 current = root;
        boolean isLeftChild = false;
        while (current.data.gpa != gpa) {
            parent = current;
            if (gpa < current.data.gpa) {
                isLeftChild = true;
                current = current.left;
            } else {
                isLeftChild = false;
                current = current.right;
            }
            if (current == null) {
                System.out.println("Couldn't find data!!");
                return;
            }
        }
        
        //delete node with no children
        if (current.left == null && current.right == null) {
            if (current == root) {
                root = null;
            } else if (isLeftChild) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        } else if (current.right == null) {//delete node with a left child
            if (current == root) {
                root = current.left;
            } else if (isLeftChild) {
                parent.left = current.left;
            } else {
                parent.right = current.left;
            }
        } else if (current.left == null) {//delete node with a right child
            if (current == root) {
                root = current.right;
            } else if (isLeftChild) {
                parent.left = current.right;
            } else {
                parent.right = current.right;
            }
        } else {
            Node19 successor = getSuccessor(current);
            if (current == root) {
                root = successor;
            } else if (isLeftChild) {
                parent.left = successor;
            } else {
                successor.left = current.left;
            }
        }
    }
    
    public void addRecursive(Student19 data) {
        root = addRecursive(root, data);
	}
    
    Node19 addRecursive(Node19 current, Student19 data) {
        if (current == null) {
            return new Node19(data);
        }

        if (data.gpa < current.data.gpa) {
            current.left = addRecursive(current.left, data);
        } else if (data.gpa > current.data.gpa) {
            current.right = addRecursive(current.right, data);
        }
	return current;
	}
}
