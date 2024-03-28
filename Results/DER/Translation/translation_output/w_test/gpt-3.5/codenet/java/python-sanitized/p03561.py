class Solver:
    def __init__(self, k, n):
        self.k = k
        self.n = n

    def solve_k1(self):
        answers = []
        for i in range((self.n + 1) // 2):
            answers.append(1)
        return answers

    def solve_k_even(self):
        answers = []
        answers.append(self.k // 2)
        for i in range(1, self.n):
            answers.append(self.k)
        return answers

    def decrement(self, digits):
        i = self.n - 1
        while True:
            if digits[i] > 1:
                digits[i] -= 1
                for j in range(i + 1, self.n):
                    digits[j] = self.k
                return
            elif digits[i] == 1:
                digits[i] -= 1
                return

    def solve_k_odd(self):
        digits = [(self.k + 1) // 2] * self.n
        for i in range(self.n // 2):
            self.decrement(digits)
        answers = []
        for i in range(self.n):
            if digits[i] > 0:
                answers.append(digits[i])
        return answers

    def solve(self):
        if self.k == 1:
            return self.solve_k1()
        elif self.k % 2 == 0:
            return self.solve_k_even()
        else:
            return self.solve_k_odd()

def execute(k, n):
    solver = Solver(k, n)
    for i in solver.solve():
        print(i)

if __name__ == "__main__":
    k, n = map(int, input().split())
    execute(k, n)