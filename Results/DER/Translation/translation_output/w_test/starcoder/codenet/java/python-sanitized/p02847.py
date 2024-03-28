import sys

days = ["MON", "TUE", "WED", "THU", "FRI","SAT","SUN"]

def main():
    in_str = sys.stdin.readline().strip()
    idx = 0
    for i in range(len(days)):
        if days[i] == in_str:
            idx = i
            break
    ans = ((6-idx+7)%7)
    if ans == 0:
        print(7)
    else:
        print(ans)

if __name__ == "__main__":
    main()