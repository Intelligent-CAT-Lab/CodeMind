def count_days(y1, m1, d1, y2, m2, d2):
    count400 = count_days_internal(1, 1, 1, 1, 400, 12, 31)
    d1 -= 1
    if d1 <= 0:
        m1 -= 1
        if m1 <= 0:
            y1 -= 1
            m1 = 12
        d1 = days[m1]
    yy1 = (y1 - 1) // 400
    c1 = count400 * yy1 + count_days_internal(yy1 * 400 + 1, 1, 1, 1, y1, m1, d1)
    yy2 = (y2 - 1) // 400
    c2 = count400 * yy2 + count_days_internal(yy2 * 400 + 1, 1, 1, 1, y2, m2, d2)
    return c2 - c1

def count_days_internal(y1, m1, d1, a, y2, m2, d2):
    count = 0
    while True:
        if y1 > y2 or (y1 == y2 and m1 > m2) or (y1 == y2 and m1 == m2 and d1 > d2):
            break
        if d1 == 13 and a == 5:
            count += 1

        d1 += 1
        if d1 > days[m1] + (1 if m1 == 2 and is_leap_year(y1) else 0):
            d1 = 1
            m1 += 1
        if m1 > 12:
            m1 = 1
            y1 += 1
        a = (a + 1) % 7
    return count

def is_leap_year(y):
    return y % 400 == 0 or (y % 4 == 0 and y % 100 != 0)

# Constants as in the original Java code
a0 = 1
days = [0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]

# Sample Test Case
y1, m1, d1, y2, m2, d2 = map(int, input().split())
print(count_days(y1, m1, d1, y2, m2, d2))