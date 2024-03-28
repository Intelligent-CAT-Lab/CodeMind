import datetime

def check_leap(year):
    if year % 400 == 0 or (year % 4 == 0 and year % 100 != 0):
        return True
    else:
        return False

def main():
    year = int(input())
    leap = check_leap(year)
    sum = 0
    mod = 0

    for i in range(year + 1, 1000000000):
        if check_leap(i):
            sum += 366
        else:
            sum += 365

        if sum % 7 == 0:
            if (check_leap(i) and leap) or (not check_leap(i) and not leap):
                print(i)
                break
            else:
                continue

if __name__ == "__main__":
    main()