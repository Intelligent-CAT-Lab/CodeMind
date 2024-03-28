class main:
    import sys
    
    def solve(in1, in2):
        return str(in1 + in2)
    
    def main():
        in1, in2 = map(int, sys.stdin.readline().split())
        print(solve(in1, in2))
    
    if __name__ == "__main__":
        main()