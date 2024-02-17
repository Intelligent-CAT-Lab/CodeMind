import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        for (String s : line.split(" ")) {
            if ("+".equals(s)) {
                stack.push(stack.pop() + stack.pop());
            } else if ("-".equals(s)) {
                int first = stack.pop();
                int second = stack.pop();
                stack.push(second - first);
            } else if ("*".equals(s)) {
                stack.push(stack.pop() * stack.pop());
            } else {
                stack.push(Integer.parseInt(s));
            }
        }
        System.out.println(stack.pop());
    }

    private static class Stack {

        static final int MAX = 200;

        int[] array;
        int index;

        Stack() {
            array = new int[MAX];
            index = 0;
        }

        void push(int value) {
            array[index] = value;
            index++;
        }

        int pop() {
            int value = array[index - 1];
            index--;
            return value;
        }

        boolean isEmpty() {
            return index == 0;
        }

        boolean isFull() {
            return index == MAX + 1;
        }
    }
}