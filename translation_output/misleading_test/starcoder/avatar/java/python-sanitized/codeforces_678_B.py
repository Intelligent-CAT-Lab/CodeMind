import java.sql.Timestamp;
import java.util.*;

def check_leap(y):
    return y % 400 == 0 or (y % 4 == 0 and y % 100!= 0)

def main():
    in = input()
    y = int(in)
    leap = check_leap(y)
    sum = 0
    mod = 0

    for i in range(y + 1,):
        if check_leap(i):
            sum += 366
        else:
            sum += 365

        if sum % 7 == 0:
            if ((check_leap(i) and leap) or (!check_leap(i) and!leap)):
                print(i)
                return
            else:
                continue

if __name__ == '__main__':
    main()