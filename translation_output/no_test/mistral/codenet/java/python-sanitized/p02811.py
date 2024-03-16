import sys

class p02811:

    def main(self):
        stdIn = sys.stdin
        K = int(stdIn.readline())
        X = int(stdIn.readline())

        if X <= 500*K:
            print("Yes")
        else:
            print("No")