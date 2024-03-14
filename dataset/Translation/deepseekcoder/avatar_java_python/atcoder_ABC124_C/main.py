import sys

def main():
    s = sys.stdin.readline().rstrip()
    ans1 = 0
    ans2 = 0

    for i, c in enumerate(s):
        c = int(c)
        
        if i % 2 == 0:
            if c == 0:
                ans1 += 1
            else:
                ans2 += 1
        else:
            if c == 1:
                ans1 += 1
            else:
                ans2 += 1

    print(min(ans1, ans2))

if __name__ == "__main__":
    main()