public class a50linkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Public static ka matlab hai ki variable ko kisi bhi class se access kiya ja
    // sakta hai aur sirf ek instance hota hai puri application mein.
    public static Node headNode;
    public static Node tailNode;
    public static int size;

    // addFirst operation in linkedList O(1)
    public void addFirst(int data) {
        // create a new node
        Node newNode = new Node(data);
        size++;
        // corner case if the linked list is empty
        if (headNode == null) {
            headNode = tailNode = newNode;
            return;
        }
        // when there are element in linked list
        newNode.next = headNode;
        headNode = newNode;
    }

    // addLast operations in linkedList O(1)
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        // if linked list is empty
        if (headNode == null) { // tailNode == null works too
            headNode = tailNode = newNode;
            return;
        }
        // if elements are present
        tailNode.next = newNode;
        tailNode = newNode;
    }

    // print operation in linkedList
    public void print() {
        Node temp = headNode;
        if (headNode == null) {
            System.out.println("null");
        }
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // add in the middle of the linked list
    public void add(int idx, int data) {
        // when we are adding element to the head
        // if (idx == 0) {
        // addFirst(data);
        // return;
        // }
        Node newNode = new Node(data);
        size++;
        if (idx == 0) {
            newNode.next = headNode;
            headNode = newNode;
            return;
        }
        Node temp = headNode;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        // temp is on prev value
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // removeFirst operation in linked list
    public void removeFirst() {
        // if linked list is empty
        if (size == 0) {
            System.out.println("LL is Empty");
            return;
        }
        // if there is only one element in ll
        if (size == 1) {
            System.out.println("Element Deleted - " + headNode.data);
            headNode = tailNode = null;
            size = 0;
            return;
        }
        System.out.println("Element Deleted - " + headNode.data);
        headNode = headNode.next;
        size--;
    }

    // removeLast operation in ll
    public void removeLast() {
        // if linked list is empty
        if (size == 0) {
            System.out.println("LL is Empty");
            return;
        }
        // if there is only one element in ll
        if (size == 1) {
        System.out.println("Element Deleted - " + tailNode.data);
            headNode = tailNode = null;
            size = 0;
            return;
        }
        Node temp = headNode;
        System.out.println("Element Deleted - " + tailNode.data);
        for (int i = 0; i < size-2; i++) {
            temp = temp.next;
        }
        temp.next = null;
        tailNode = temp;
        size--;
    }

    //iterative search in linked list O(n)
    public int itrSearch(int key){
        Node temp = headNode;
        int i = 0;
        while (temp!=null) {
            if (temp.data==key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        // key not found
        return -1;
    }
    
    // Recursive Search in linked list
    public int helper(Node headNode, int key){
        if (headNode == null) {
            return -1;
        }
        if (headNode.data == key) {
            return 0;
        }
        int idx = helper(headNode.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(headNode,key);
    }

    // Reverse a linked list
    public void revLL(){
        Node prev = null;
        Node curr = tailNode = headNode; // after reverse head becomes the tail 
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        headNode = prev;
    }

    //**  find and remove nth form End 
    public void removeNthFromEnd(int n){
        // calculating size 
        int sz = 0;
        Node temp = headNode;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }
        // if n is last element then start is headEle
        // last se n mtlb shuruvat se head
        if (n == sz) {
            headNode = headNode.next;
            return;
        }
        // agar koi element last ne n pos pr hai to vo starting se (size-n+1) position pr hoga
        Node prev = headNode;
        int i = 1;
        while (i < size-n) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    // finding mid of a ll
    public Node findMid(Node head){
    Node slow = head;
    Node fast = head;
    while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }
        return slow; // slow in on midNode
    }
    
    // check Palindrome
    public boolean checkPalindrome(){
        if (headNode == null || headNode.next == null) {
            return true;
        }
        // find mid
        Node midNode = findMid(headNode);
        // reverse the linked list
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        // check left and right half
        Node left = headNode; // left half head
        Node right = prev; //right half head

        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    
    // check cycle in ll using Floyd's CFA
    public boolean isCycle(){
        Node slow = headNode;
        Node fast = headNode;
        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; /// +2
            if (fast == slow) {
                return true; // cycle exist
            }
        }
        return false; // cycle doesn't exist
    }
    // Remove cycle from a linked List
    public void removeCycle(){
        // check cycle
        Node slow = headNode;
        Node fast = headNode;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; /// +2
            if (fast == slow) {
                cycle = true; // cycle exist
                break;
            }
        }
        if (cycle == false) {
            return;
        }
        //  find meeting point
        slow = headNode;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next; // +1
            fast = fast.next; // +1
        }
        // remove cycle
        prev.next = null;                                                     
    }
    

    public static void main(String[] args) {
        a50linkedList ll = new a50linkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(1);
        ll.add(3, 2); //add anywhere
        // ll.removeFirst();
        // ll.removeLast();
        // ll.print();
        // System.out.println("Index - "+ll.itrSearch(3));
        // System.out.println("Index - "+ll.recSearch(3));
        // System.out.println("Index - "+ll.recSearch(10));
        // ll.revLL();
        // ll.removeNthFromEnd(5);
        ll.print();
        // System.out.println("Size - " + size);
        System.out.println(ll.checkPalindrome());
    }
}
