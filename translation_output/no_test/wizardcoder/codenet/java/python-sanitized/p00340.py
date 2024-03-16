import sys

class Rectangle:
    def __init__(self, sides):
        self.sides = sides

    def is_square(self):
        sides = sorted(self.sides)
        return sides[0] == sides[1] and sides[2] == sides[3]

def main():
    input_stream = sys.stdin
    sides = list(map(int, input_stream.readline().strip().split()))
    rectangle = Rectangle(sides)
    if rectangle.is_square():
        print("yes")
    else:
        print("no")

if __name__ == '__main__':
    main()