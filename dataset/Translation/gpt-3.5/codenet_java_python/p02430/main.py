import sys
import math

class p02430:

    def solve(self, n, k):
        for bit in range(1 << n):
            if bin(bit).count('1') != k:
                continue
            print(bit, end=':')
            for j in range(n):
                if (bit >> j) & 1 == 1:
                    print(" " + str(j), end='')
            print()

    @staticmethod
    def main():
        main_instance = p02430()
        n, k = map(int, input().split())
        main_instance.solve(n, k)

if __name__ == "__main__":
    p02430.main()