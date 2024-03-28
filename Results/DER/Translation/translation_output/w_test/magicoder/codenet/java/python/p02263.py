<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 +

Expected output:
3


```
import java.util.Scanner;

public class p02263 {
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
```

@@ Response
```python
class Stack:
    def __init__(self):
        self.stack = []

    def push(self, value):
        self.stack.append(value)

    def pop(self):
        return self.stack.pop()

    def is_empty(self):
        return len(self.stack) == 0

    def is_full(self):
        return len(self.stack) == 200


def main():
    stack = Stack()
    line = input().split()
    for s in line:
        if s == '+':
            stack.push(stack.pop() + stack.pop())
        elif s == '-':
            first = stack.pop()
            second = stack.pop()
            stack.push(second - first)
        elif s == '*':
            stack.push(stack.pop() * stack.pop())
        else:
            stack.push(int(s))
    print(stack.pop())


if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a line of input, splits it into tokens, and pushes numbers onto the stack and performs operations on the stack when it encounters '+', '-', or '*'. The result is printed at the end.<｜end▁of▁sentence｜>
