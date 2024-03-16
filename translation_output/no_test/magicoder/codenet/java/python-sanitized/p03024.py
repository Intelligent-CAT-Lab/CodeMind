import sys

def main():
    res = sys.stdin.readline().strip()
    day = len(res)
    nday = 15 - day
    cnt = res.count('o')
    if (day <= 7) or ((day >= 8) and ((cnt + nday) >= 8)):
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()