```python
from collections import namedtuple
import sys

Point = namedtuple('Point', ['x', 'y'])

class NaiveSolver:
    def __init__(self, w, h, k):
        self.w = w
        self.h = h
        self.k = k

    @staticmethod
    def gcd_rec(a, b):
        return b if a % b == 0 else NaiveSolver.gcd(b, a % b)

    @staticmethod
    def gcd(a, b):
        abs_a = abs(a)
        abs_b = abs(b)
        if abs_a == 0 or abs_b == 0:
            return abs_a + abs_b
        return NaiveSolver.gcd_rec(abs_a, abs_b)

    def accept(self, x1, y1, x2, y2, x3, y3):
        dx2 = x2 - x1
        dy2 = y2 - y1
        dx3 = x3 - x1
        dy3 = y3 - y1
        s_double = abs(dx2 * dy3 - dx3 * dy2)
        g1 = NaiveSolver.gcd(x1 - x2, y1 - y2)
        g2 = NaiveSolver.gcd(x2 - x3, y2 - y3)
        g3 = NaiveSolver.gcd(x3 - x1, y3 - y1)
        g = g1 + g2 + g3
        return s_double - g + 2 <= 2 * self.k

    def solve(self):
        answer = 0
        for x1 in range(1, self.w):
            for y1 in range(1, self.h):
                for x2 in range(1, self.w):
                    if self.accept(x1, 0, 0, y1, x2, self.h):
                        answer += 1
        return answer

    def add_answer(self, answers, x1, y1, x2, y2, x3, y3):
        point1 = Point(x1, y1)
        point2 = Point(x2, y2)
        point3 = Point(x3, y3)
        sorted_points = sorted([point1, point2, point3])
        answers.append(sorted_points)

    def solve_list(self):
        answers = []
        for x1 in range(1, self.w):
            for y1 in range(1, self.h):
                for x2 in range(1, self.w):
                    if self.accept(x1, 0, 0, y1, x2, self.h):
                        self.add_answer(answers, x1, 0, 0, y1, x2, self.h)
        answers.sort(key=lambda x: (x[0].x, x[0].y, x[1].x, x[1].y, x[2].x, x[2].y))
        return answers

class SubSolver:
    def __init__(self, w, h, k, rotate):
        self.w = w
        self.h = h
        self.k = k
        self.rotate = rotate

    @staticmethod
    def gcd(a, b):
        if a == 0 or b == 0:
            return a + b
        return b if a % b == 0 else SubSolver.gcd(b, a % b)

    def accept(self, s, x, r, y):
        return y + s < self.h and self.w * y - SubSolver.gcd(x, y) - SubSolver.gcd(self.w - x, y + s) <= r

    def solve(self):
        answer = 0
        for x in range(1, self.w):
            answer += self.solve_single(0, x)

        for s in range(1, self.h - 1):
            gcd_sw = SubSolver.gcd(s, self.w)
            for x in range(1, self.w):
                if s * x <= 2 * self.k + gcd_sw - 2:
                    answer += 2 * self.solve_single(s, x)

        return answer

    def solve_single(self, s, x):
        r = 2 * self.k + SubSolver.gcd(s, self.w) - s * x - 2
        answer = min(r // self.w, self.h - s - 1)
        a = False
        if self.accept(s, x, r, r // self.w + 1):
            a = True
            answer += 1
        return answer

    def solve_list(self):
        answers = []
        for x in range(1, self.w):
            answers += self.solve_list_single(0, x)

        for s in range(1, self.h - 1):
            gcd_sw = SubSolver.gcd(s, self.w)
            for x in range(1, self.w):
                answers += self.solve_list_single(s, x)

        return answers

    def solve_list_single(self, s, x):
        answers = []
        r = 2 * self.k + SubSolver.gcd(s, self.w) - s * x - 2
        for y in range(1, r // self.w + 1):
            if y + s < self.h:
                answers.append([Point(s, x), Point(0, y), Point(self.w, y + s)])
        if self.accept(s, x, r, r // self.w + 1):
            answers.append([Point(s, x), Point(0, r // self.w + 1), Point(self.w, r // self.w + 1)])
        return answers

class Solver:
    def __init__(self, w, h, k):
        self.w = w
        self.h = h
        self.k = k

    def solve(self):
        sub_solver1 = SubSolver(self.w, self.h, self.k, False)
        sub_solver2 = SubSolver(self.h, self.w, self.k, True)
        answer1 = sub_solver1.solve()
        answer2 = sub_solver2.solve()
        return 2 * (answer1 + answer2)

    def solve_list(self):
        sub_solver1 = SubSolver(self.w, self.h, self.k, False)
        sub_solver2 = SubSolver(self.h, self.w, self.k, True)
        answers = []
        answers += sub_solver1.solve_list()
        answers += sub_solver2.solve_list()
        answers.sort(key=lambda x: (x[0].x, x[0].y, x[1].x, x[1].y, x[2].x, x[2].y))
        return answers

if __name__ == '__main__':
    input_lines = sys.stdin.read().strip().split('\n')
    w, h, k = map(int, input_lines[0].split())
    solver = Solver(w, h, k)
    print(solver.solve())

# Note: Input reading and output displaying have not been implemented in the provided code. Input should be read from stdin and output should be printed to stdout.
```
