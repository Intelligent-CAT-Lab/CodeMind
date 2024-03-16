def check_leap(year):
    return (year % 400 == 0) or ((year % 4 == 0) and (year % 100 != 0))

def main():
    year = int(input())
    leap = check_leap(year)
    sum_days = 0

    i = year + 1
    while True:
        if check_leap(i):
            sum_days += 366
        else:
            sum_days += 365
            
        if sum_days % 7 == 0:
            if (check_leap(i) and leap) or (not check_leap(i) and not leap):
                print(i)
                break
        
        i += 1

if __name__ == "__main__":
    main()