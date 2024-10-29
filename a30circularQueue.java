public class a30circularQueue {
    int rear, front;
    int size;
    int[] circularQueue;
    int capacity;

    public a30circularQueue(int capacity) {
        this.capacity = capacity;
        this.circularQueue = new int[capacity];
        front = rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        if (front == -1) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (size == capacity) {
            return true;
        }
        // if ((front == 0 && rear == capacity - 1) || (front != 0 && rear == (front - 1) % capacity)) {
        //     return true;
        // }
        return false;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return circularQueue[front];

    }

    public void enqueue(int val) {
        if (isFull()) {
            System.out.println("Queue is Full");
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        } else if (rear == capacity - 1 && front != 0) {
            rear = 0;
        } else {
            rear++;
        }
        circularQueue[rear] = val;
        size++;
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        int val = circularQueue[front];
        if (front == rear) {
            front = rear  = -1;
        }else if (front == capacity-1) {
            front = 0;
        }else{
            front++;
        }
        size--;
        return val;
    }

    public void printQueue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        if (front <= rear) {//normal case
            for (int i = front; i <= rear; i++) {
                System.out.print(circularQueue[i] + ",");
            }
        } else {
            for (int i = front; i < capacity; i++) {
                System.out.print(circularQueue[i] + ",");
            }
            for (int i = 0; i <= rear; i++) {
                System.out.print(circularQueue[i] + ",");
            }
        }
        System.out.println();
    }
    public int size(){
        return size;
    }


    public static void main(String[] args) {
        a30circularQueue myCircularQueue = new a30circularQueue(5);
        System.out.println("Capacity is: " + 5);
        System.out.println("Print:");
        myCircularQueue.printQueue();
        System.out.println("Insert element :" + 7);
        myCircularQueue.enqueue(7);
        System.out.println("Peak element: " + myCircularQueue.peek());
        System.out.println("Insert element :" + 8);
        myCircularQueue.enqueue(8);
        System.out.println("Peak element: " + myCircularQueue.peek());
        System.out.println("Insert element :" + 9);
        myCircularQueue.enqueue(9);
        System.out.println("Peak element: " + myCircularQueue.peek());
        System.out.println("Insert element :" + 11);
        myCircularQueue.enqueue(11);
        System.out.println("Insert element :" + 19);
        myCircularQueue.enqueue(19);
        System.out.println("Insert element :" + 9);
        myCircularQueue.enqueue(9);
        System.out.println("is CircularQueue full: " + myCircularQueue.isFull());
        System.out.println("Print:");
        myCircularQueue.printQueue();
        System.out.println("delete element");
        myCircularQueue.dequeue();
        System.out.println("is CircularQueue full: " + myCircularQueue.isFull());
        System.out.println("Print:");
        myCircularQueue.printQueue();
        System.out.println("Insert element :" + 19);
        myCircularQueue.enqueue(19);
        System.out.println("Print:");
        myCircularQueue.printQueue();
        System.out.println("Peak element: " + myCircularQueue.peek());
        System.out.println("delete element");
        myCircularQueue.dequeue();
        System.out.println("Peak element: " + myCircularQueue.peek());

        System.out.println("is CircularQueue empty: " + myCircularQueue.isEmpty());

        System.out.println("Print:");
        myCircularQueue.printQueue();
        System.out.println("delete element");
        myCircularQueue.dequeue();
        System.out.println("delete element");
        myCircularQueue.dequeue();
        System.out.println("delete element");
        myCircularQueue.dequeue();
        System.out.println("delete element");
        myCircularQueue.dequeue();
        System.out.println("is CircularQueue empty: " + myCircularQueue.isEmpty());
        System.out.println("Print:");
        myCircularQueue.printQueue();
        System.out.println("delete element");
        myCircularQueue.dequeue();
    }
}
