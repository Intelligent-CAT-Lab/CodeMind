import sys

def find_day(day):
    days = ["MON", "TUE", "WED", "THU", "FRI","SAT","SUN"]
    idx = days.index(day)
    ans = ((6-idx+7)%7)
    if ans==0:
        return 7
    else:
        return ans

if __name__ == "__main__":
    day = sys.stdin.readline().strip()
    print(find_day(day))