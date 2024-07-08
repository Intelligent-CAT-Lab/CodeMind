import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
var newVariable_0 = line.split(" ");        for (String s : newVariable_0) {
var newVariable_1 = "+".equals(s);            if (newVariable_1) {
                stack.push(stack.pop() + stack.pop());
var newVariable_2 = "-".equals(s);            } else if (newVariable_2) {
                int first = stack.pop();
                int second = stack.pop();
                stack.push(second - first);
var newVariable_3 = "*".equals(s);            } else if (newVariable_3) {
                stack.push(stack.pop() * stack.pop());
            } else {
var newVariable_4 = Integer.parseInt(s);                stack.push(newVariable_4);
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