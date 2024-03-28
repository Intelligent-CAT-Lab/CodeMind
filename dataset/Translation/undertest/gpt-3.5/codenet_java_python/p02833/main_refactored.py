class main:
    import sys
    
    class TaskX:
        def solve(self, in_val):
            n = int(in_val)
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
    
    def main():
        in_val = sys.stdin.readline().strip()
        solver = TaskX()
        result = solver.solve(in_val)
        print(result)
    
    if __name__ == "__main__":
        main()