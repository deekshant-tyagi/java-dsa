import java.util.Scanner;
import java.util.Stack;
public class a28Stacks {
    int stack[];
    int top;
    int size;
    public a28Stacks(int stackSize){
        stack = new int[stackSize];
        size = stackSize;
        top = -1;
    }

    public void push(int ele){
        if (top>=size-1) {
            System.out.println("Stack is full -> Overflow");
            return;
        }
        top++;
        stack[top] = ele;
    }

    public boolean isEmpty(){
        return  (top <= -1);
    }

    public int size(){
        return top+1;
    }

    public int peek(){
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return Integer.MIN_VALUE;
        }
        return stack[top];
    }

    public int pop(){
        int val = peek();
        if (val!=Integer.MIN_VALUE) {
            top--;
        }
        return val;
    }

    public void printStack(){
        System.out.println("Printing stack");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i]);
            if (i!=top) {
                System.out.print(',');
            }
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Stack: ");
        int n = sc.nextInt();
        a28Stacks stack = new a28Stacks(n);
        System.out.println("isEmpty:"+  stack.isEmpty());
        stack.push(9);
        stack.printStack();
        stack.push(1);
        stack.printStack();
        stack.push(8);
        stack.printStack();
        stack.push(5);
        stack.printStack();
        stack.push(8);
        stack.printStack();
        stack.push(2);
        stack.printStack();
        stack.push(6);
        stack.printStack();
        stack.pop();
        stack.printStack();
        System.out.println("size:"+  stack.size());
        System.out.println("isEmpty:"+  stack.isEmpty());
        stack.pop();
        stack.printStack();
        stack.pop();
        stack.printStack();
        stack.pop();
        stack.printStack();
        System.out.println("peek:"+  stack.peek());

        //Using stack from JC framework
        // Stack<Integer> myClass = new Stack<>();
        // myClass.peek();
        // myClass.push(7);
        // myClass.pop();
        // myClass.size();
        // myClass.isEmpty();
    }
}
