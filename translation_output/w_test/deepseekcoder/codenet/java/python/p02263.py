<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
class Stack:
    def __init__(self):
        self.array = []

    def push(self, value):
        self.array.append(value)

    def pop(self):
        return self.array.pop()

    def is_empty(self):
        return len(self.array) == 0

def calculate(expression):
    stack = Stack()
    for s in expression.split(" "):
        if s == "+":
            stack.push(stack.pop() + stack.pop())
        elif s == "-":
            first = stack.pop()
            second = stack.pop()
            stack.push(second - first)
        elif s == "*":
            stack.push(stack.pop() * stack.pop())
        else:
            stack.push(int(s))
    return stack.pop()

print(calculate(input()))
```

This Python code does the same thing as the Java code. It reads an expression from the standard input, tokenizes it, and pushes numbers onto a stack. When it encounters an operator, it pops the top two numbers off the stack, applies the operator, and pushes the result back onto the stack. The final result is the top of the stack.
<|EOT|>
