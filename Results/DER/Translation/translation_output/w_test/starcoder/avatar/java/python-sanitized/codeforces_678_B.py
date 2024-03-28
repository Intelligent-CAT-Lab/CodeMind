import java.sql.Timestamp;
import java.util.*;

def check_leap(y):
    return y % 400 == 0 or (y % 4 == 0 and y % 100!= 0)

def main(y):
    sum = 0
    mod = 0
    for i in range(y+1, 1000000000):
        if check_leap(i):
            sum += 366
        else:
            sum += 365
        if sum % 7 == 0:
            if (check_leap(i) and check_leap(y)) or (not check_leap(i) and not check_leap(y)):
                print(i)
                return
            else:
                continue

if __name__ == "__main__":
    main(2096)