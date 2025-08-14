public class a52doubleLL {
    public class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public static Node headNode;
    public static Node tailNode;

    // add first in dll
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (headNode == null) {
            headNode = tailNode = newNode;
            return;
        }
        newNode.next = headNode;
        headNode.prev = newNode;
        headNode = newNode;
    }

    // print
    public void print() {
        Node temp = headNode;
        if (headNode == null) {
            System.out.println("null");
        }
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // remove first from dll
    public void removeFirst() {
        if (headNode == null) {
            System.out.println("Dll is empty");
            return;
        }
        if (headNode.next.next == null) {
            headNode = tailNode = null;
            return;
        }
        headNode = headNode.next;
        headNode.prev = null;
    }

    // reverse a dll
    public void revDLL() {
        Node prev = null;
        Node curr = tailNode = headNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        headNode = prev;
    }

    public static void main(String[] args) {
        a52doubleLL dll = new a52doubleLL();
        dll.addFirst(1);
        dll.addFirst(2);
        dll.addFirst(3);
        // dll.print();
        // dll.removeFirst();
        // dll.removeFirst();
        // dll.removeFirst();
        dll.print();
        dll.revDLL();
        dll.print();
    }
}
