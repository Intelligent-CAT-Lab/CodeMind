import sys

def solve(X):
    return X[:4] + " " + X[4]

if __name__ == "__main__":
    X = sys.stdin.readline().strip()
    print(solve(X))