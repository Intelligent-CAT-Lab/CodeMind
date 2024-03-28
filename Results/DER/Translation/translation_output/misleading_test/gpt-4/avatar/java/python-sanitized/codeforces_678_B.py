def check_leap(y):
    return y % 400 == 0 or (y % 4 == 0 and y % 100 != 0)

def find_similar_year(y):
    leap = check_leap(y)
    sum_days = 0
    
    i = y + 1
    while True:
        if check_leap(i):
            sum_days += 366
        else:
            sum_days += 365
            
        if sum_days % 7 == 0:
            if (check_leap(i) and leap) or (not check_leap(i) and not leap):
                return i
            else:
                continue
        i += 1

# Test input
y = 2096
# Expected output: 2141
print(find_similar_year(y))