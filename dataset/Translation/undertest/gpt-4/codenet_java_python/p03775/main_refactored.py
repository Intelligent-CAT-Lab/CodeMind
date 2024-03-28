class main:
    import sys
    import math
    
    def main():
        n = int(input())
        atcoder = AtCoder(n)
        result = atcoder.solve()
        print(result)
    
    class AtCoder:
        def __init__(self, n):
            self.N = n
    
        def solve(self):
            sqrt = int(math.sqrt(self.N))
            for i in range(sqrt, 0, -1):
                if self.N % i == 0:
                    a_length = len(str(i))
                    b_length = len(str(self.N // i))
                    return max(a_length, b_length)
    
    
    if __name__ == "__main__":
        main()