import sys

def main():
    S = sys.stdin.readline().strip()
    ans = "Yes"

    if len(S) % 2 == 1:
        ans = "No"
    else:
        for i in range(0, len(S) // 2, 2):
            if S[i:i+2] != "hi":
                ans = "No"
                break

    print(ans)

if __name__ == "__main__":
    main()