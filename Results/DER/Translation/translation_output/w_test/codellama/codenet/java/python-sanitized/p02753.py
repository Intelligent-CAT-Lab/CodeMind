import sys

def main():
    S = sys.stdin.readline().strip()
    if S[0] == S[1] and S[1] == S[2]:
        print("No")
    else:
        print("Yes")

if __name__ == "__main__":
    main()