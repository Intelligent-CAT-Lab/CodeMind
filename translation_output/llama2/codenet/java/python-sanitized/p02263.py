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

    def isEmpty(self):
        return self.index == 0

    def isFull(self):
        return self.index == 200


def main():
    scanner = sys.stdin.readline
    line = scanner().strip()
    stack = Stack()
    for s in line.split(" "):
        if "+".__eq__(s):
            stack.push(stack.pop() + stack.pop())
        elif "-".__eq__(s):
            first = stack.pop()
            second = stack.pop()
            stack.push(second - first)
        elif "*".__eq__(s):
            stack.push(stack.pop() * stack.pop())
        else:
            stack.push(int(s))
    print(stack.pop())


if __name__ == "__main__":
    main()