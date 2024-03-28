```python
class Solver:
    def __init__(self, k, n):
        self.k = k
        self.n = n
        
    def solveK1(self):
        answers = []
        for i in range((self.n + 1) // 2):
            answers.append(1)
        return answers
    
    def solveKEven(self):
        answers = []
        answers.append(self.k // 2)
        for i in range(1, self.n):
            answers.append(self.k)
        return answers
    
    def decrement(self, digits):
        for i in range(self.n - 1, -1, -1):
            if digits[i] > 1:
                digits[i] -= 1
                for j in range(i + 1, self.n):
                    digits[j] = self.k
                return
            elif digits[i] == 1:
                digits[i] -= 1
                return
    
    def solveKOdd(self):
        digits = [(self.k + 1) // 2] * self.n
        for i in range(self.n // 2):
            self.decrement(digits)
        answers = [digits[i] for i in range(self.n) if digits[i] > 0]
        return answers
    
    def solve(self):
        if self.k == 1:
            return self.solveK1()
        elif self.k % 2 == 0:
            return self.solveKEven()
        else:
            return self.solveKOdd()

# Test case
input_nums = input().split()
k = int(input_nums[0])
n = int(input_nums[1])
for i in Solver(k, n).solve():
    print(i, end=" ")
```
