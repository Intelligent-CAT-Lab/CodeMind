import sys

class Rectangle:
    def __init__(self, sides):
        self.sides = sides

    def isSquare(self):
        sides = sorted(self.sides)
        return sides[0] == sides[1] and sides[2] == sides[3]

def main():
    input_str = sys.stdin.readline().strip()
    sides = list(map(int, input_str.split()))
    rect = Rectangle(sides)
    if rect.isSquare():
        print("o")
    else:
        print("no")

if __name__ == '__main__':
    main()