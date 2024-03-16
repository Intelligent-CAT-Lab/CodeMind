import sys

class TaskX:
    def solve(self, in_data):
        n = int(in_data)
        if n % 2 == 1:
            return '0'

        ans = 0
        base = 10
        while True:
            if base > n:
                break
            ans += n // base
            base *= 5

        return str(ans)

def main():
    in_data = sys.stdin.readline().strip()
    solver = TaskX()
    result = solver.solve(in_data)
    print(result)

if __name__ == '__main__':
    main()