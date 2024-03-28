import sys

def insert_space(X):
    return X[:4] + " " + X[4:]

X = sys.stdin.readline().strip()
print(insert_space(X))