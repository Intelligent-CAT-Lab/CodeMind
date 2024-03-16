import sys

days = ["MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"]

def get_day_index(day):
    for i, d in enumerate(days):
        if d == day:
            return i
    return -1

def get_next_day(day):
    idx = get_day_index(day)
    if idx == -1:
        return -1
    return (idx + 1) % 7

def main():
    day = sys.stdin.readline().strip()
    next_day = get_next_day(day)
    if next_day == -1:
        print("Invalid input")
    else:
        print(days[next_day])

if __name__ == "__main__":
    main()