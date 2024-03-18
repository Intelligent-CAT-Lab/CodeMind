from sys import stdin, stdout

class BAlgae:
    def solve(self, r, d, x):
        for i in range(10):
            x = r * x - d
            print(x)

def main():
    r, d, x = map(int, input().split())
    
    solver = BAlgae()
    solver.solve(r, d, x)

if __name__ == "__main__":
    main()