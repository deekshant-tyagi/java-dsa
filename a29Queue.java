public class a29Queue {
    int rear , front;
    int queue[];
    int capacity;
    int size;

    public a29Queue(int capacity){
        front = rear = -1;
        size = 0;
        this.capacity = capacity;
        queue = new int[capacity];
    }

    public boolean isFull(){
        if (rear==capacity-1) {
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
        if (front==-1) {
            return true;
        }
        return false;
    }

    public int peek(){
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return queue[front];
    }

    public void enqueue(int val){
        if (isFull()) {
            System.out.println("Queue is Full");
            return;
        }
        if (isEmpty()) {
            rear = front = 0;
        }else{
            rear++;
        }
        size++;
        queue[rear] = val;
    }
    public int dequeue(){
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int val = queue[front];
        if (front==rear) {
            front = -1;
            rear  = -1;
        }else{
            front++;
        }
        size--;
        return val;
    }
    
    public int size() {
        return size;  
    }

    public void printQueue(){
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        for(int i = front; i<=rear; i++){
            System.out.print(queue[i] + ",");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        a29Queue myQueue = new a29Queue(5);
        System.out.println("Capacity is: "+5);
        System.out.println("Print:");
        myQueue.printQueue();
        System.out.println("Insert element :"+7);
        myQueue.enqueue(7);
        System.out.println("Peak element: "+ myQueue.peek());
        System.out.println("Insert element :"+8);
        myQueue.enqueue(8);
        System.out.println("Peak element: "+ myQueue.peek());
        System.out.println("Insert element :"+9);
        myQueue.enqueue(9);
        System.out.println("Peak element: "+ myQueue.peek());
        System.out.println("Insert element :"+11);
        myQueue.enqueue(11);
        System.out.println("Insert element :"+19);
        myQueue.enqueue(19);
        System.out.println("Insert element :"+9);
        myQueue.enqueue(9);
        System.out.println("is Queue full: "+ myQueue.isFull());
        System.out.println("Print:");
        myQueue.printQueue();
        System.out.println("delete element");
        myQueue.dequeue();
        System.out.println("is Queue full: "+ myQueue.isFull());
        System.out.println("Print:");
        myQueue.printQueue();
        System.out.println("Insert element :"+19);
        myQueue.enqueue(19);
        System.out.println("Print:");
        myQueue.printQueue();
        System.out.println("Peak element: "+ myQueue.peek());
        System.out.println("delete element");
        myQueue.dequeue();
        System.out.println("Peak element: "+ myQueue.peek());
        System.out.println("is Queue empty: "+ myQueue.isEmpty());
        System.out.println("Print:");
        myQueue.printQueue();
        System.out.println("delete element");
        myQueue.dequeue();
        System.out.println("delete element");
        myQueue.dequeue();
        System.out.println("delete element");
        myQueue.dequeue();
        System.out.println("delete element");
        myQueue.dequeue();
        System.out.println("is Queue empty: "+ myQueue.isEmpty());
        System.out.println("Print:");
        myQueue.printQueue();
        System.out.println("delete element");
        myQueue.dequeue();
    }
}
