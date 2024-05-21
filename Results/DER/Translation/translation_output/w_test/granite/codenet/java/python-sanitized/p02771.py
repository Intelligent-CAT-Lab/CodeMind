import sys

def main():
    A, B, C = map(int, sys.stdin.readline().split())

    if (A == B and B == C) or (A!= B and A!= C and B!= C):
        print("No")
    else:
        print("Yes")

if __name__ == "__main__":
    main()