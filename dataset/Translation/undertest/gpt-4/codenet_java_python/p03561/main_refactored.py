class main:
    class Solver:
        def __init__(self, k, n):
            self.k = k
            self.n = n
    
        def solve_k1(self):
            answers = [1] * ((self.n + 1) // 2)
            return answers
    
        def solve_k_even(self):
            answers = [self.k // 2] + [self.k for _ in range(1, self.n)]
            return answers
    
        def decrement(self, digits):
            for i in reversed(range(self.n)):
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
            answers = [digit for digit in digits if digit > 0]
            return answers
    
        def solve(self):
            if self.k == 1:
                return self.solve_k1()
            elif self.k % 2 == 0:
                return self.solve_k_even()
            else:
                return self.solve_k_odd()
    
    def main():
        k, n = map(int, input().split())
        solver = Solver(k, n)
        result = solver.solve()
        for number in result:
            print(number, end=' ')
        print()
    
    if __name__ == "__main__":
        main()