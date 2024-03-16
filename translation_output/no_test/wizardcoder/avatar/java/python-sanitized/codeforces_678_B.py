import java.sql.Timestamp
import java.util.*

def check_leap(y):
    return y % 400 == 0 or (y % 4 == 0 and y % 100!= 0)

def main():
    in = Scanner(System.in)
    y = in.nextInt()
    leap = check_leap(y)
    sum = 0
    mod = 0
    
    for i in range(y+1, sys.maxsize):
        if check_leap(i):
            sum += 366
        else:
            sum += 365
        
        if sum % 7 == 0:
            if (check_leap(i) and leap) or (not check_leap(i) and not leap):
                print(i)
                return
            else:
                continue

if __name__ == '__main__':
    main()