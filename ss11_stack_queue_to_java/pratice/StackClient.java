package ss11_stack_queue_to_java.pratice;

public class StackClient {
    public static void main(String[] args) throws Exception {
        MyStack stack = new MyStack(6);
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.push(0);
        System.out.println("1. Size of stack after push operations: " + stack.size());
        System.out.println("2. Pop elements from stack : ");
        while (!stack.isEmpty()) {
            System.out.println(" %d" + stack.pop());
        }
        System.out.println("\n3. Size of stack after pop operations : " + stack.size());
    }
}
