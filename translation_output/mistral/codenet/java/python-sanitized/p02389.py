import sys

def main():
    in = sys.stdin
    out = sys.stdout
    
    def solve():
        a = int(in.readline())
        b = int(in.readline())
        out.write(str(a*b) + " " + (2*a+2*b))
        out.flush()
        
    solver = Solution()
    solver.solve()
    out.close()

class Solution:
    def solve(self):
        a = int(in.readline())
        b = int(in.readline())
        out.write(str(a*b) + " " + (2*a+2*b))
        out.flush()

if __name__ == "__main__":
    main()