import sys

class ATwoProblems:
    def solve(self, points, t, a, b, ta, tb):
        for i in range(t):
            for j in range(t):
                if (points == a - i * ta + b - j * tb) or (points == 0) or (points == a - ta * i) or (points == b - tb * j):
                    return "Y"
        return "N"

def main():
    inputs = input().split()
    points, t, a, b, ta, tb = map(int, inputs)
    a_two_problems = ATwoProblems()
    output = a_two_problems.solve(points, t, a, b, ta, tb)
    print(output)

if __name__ == "__main__":
    main()