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