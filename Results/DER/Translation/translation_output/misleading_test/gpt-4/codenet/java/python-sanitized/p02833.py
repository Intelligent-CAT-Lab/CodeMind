import sys

class TaskX:
    def solve(self, n):
        if n % 2 == 1:
            return 0

        ans = 0
        base = 10
        while True:
            if base > n:
                break
            ans += n // base
            base *= 5
        return ans

if __name__ == "__main__":
    n = int(sys.stdin.readline().strip())
    task = TaskX()
    result = task.solve(n)
    print(result)