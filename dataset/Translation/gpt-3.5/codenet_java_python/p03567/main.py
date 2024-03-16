import sys
import math

class UnionFind:
    def __init__(self, n):
        self.Parent = [-1] * n

    def root(self, A):
        if self.Parent[A] < 0:
            return A
        self.Parent[A] = self.root(self.Parent[A])
        return self.Parent[A]

    def size(self, A):
        return -self.Parent[self.root(A)]

    def connect(self, A, B):
        A = self.root(A)
        B = self.root(B)
        if A == B:
            return False
        if self.size(A) < self.size(B):
            C = B
            B = A
            A = C
        self.Parent[A] += self.Parent[B]
        self.Parent[B] = A
        return True

def main():
    str = input()
    for i in range(1, len(str)):
        if str[i - 1] == 'A' and str[i] == 'C':
            print("Yes")
            return
    print("No")

if __name__ == "__main__":
    main()