import sys

a0 = 1
days = [0,31,28,31,30,31,30,31,31,30,31,30,31]

def isUruu(y):
    if y % 400 == 0:
        return True
    elif y % 100 == 0:
        return False
    else:
        return y % 4 == 0

def count(y1,m1,d1,y2,m2,d2):
    count400 = count(1,1,1,a0,400,12,31)
    d1 -= 1
    if d1 <= 0:
        m1 -= 1
        if m1 <= 0:
            y1 -= 1
            m1 = 12
        d1 = days[m1]
    yy1 = (y1 - 1) / 400
    c1 = count400 * yy1 + count(yy1 * 400 + 1, 1, 1, a0, y1, m1, d1)
    yy2 = (y2 - 1) / 400
    c2 = count400 * yy2 + count(yy2 * 400 + 1, 1, 1, a0, y2, m2, d2)
    return c2 - c1

def count(y1,m1,d1,a,y2,m2,d2):
    count = 0
    while True:
        if y1 > y2 or y1 == y2 and m1 > m2 or y1 == y2 and m1 == m2 and d1 > d2:
            break
        if d1 == 13 and a == 5:
            count += 1
        d1 += 1
        if d1 > days[m1] + (m1 == 2 and isUruu(y1) and 1 or 0):
            d1 = 1
            m1 += 1
        if m1 > 12:
            m1 = 1
            y1 += 1
        a = (a + 1) % 7
    return count

if __name__ == '__main__':
    y1,m1,d1,y2,m2,d2 = map(int,sys.stdin.readline().split())
    print count(y1,m1,d1,y2,m2,d2)