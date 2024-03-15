<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
[/INST]
```python
import sys

class Stack:
    def __init__(self):
        self.array = [0] * 200
        self.index = 0

    def push(self, value):
        self.array[self.index] = value
        self.index += 1

    def pop(self):
        return self.array[self.index - 1]
        self.index -= 1

    def isEmpty(self):
        return self.index == 0

    def isFull(self):
        return self.index == 200


if __name__ == "__main__":
    stack = Stack()
    scanner = sys.stdin
    line = scanner.readline()
    for s in line.split():
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
    print(stack.pop())
```</s>
