import datetime

def count(y1, m1, d1, y2, m2, d2):
    d1 -= 1
    if d1 < 0:
        m1 -= 1
        if m1 < 0:
            y1 -= 1
            m1 = 11
        d1 = datetime.date(y1, m1, d1).timetuple().tm_yday
    count400 = count(1, 1, 1, 1, 4, 1)
    yy1 = (y1 - 1) // 400
    c1 = count400 * yy1 + count(yy1 * 400 + 1, 1, 1, 1, y1, m1, d1)
    yy2 = (y2 - 1) // 400
    c2 = count400 * yy2 + count(yy2 * 400 + 1, 1, 1, 1, y2, m2, d2)
    return c2 - c1

def count(y1, m1, d1, a, y2, m2, d2):
    count = 0
    while True:
        if y1 > y2 or y1 == y2 and m1 > m2 or y1 == y2 and m1 == m2 and d1 > d2:
            break
        if d1 == 12 and a == 4:
            count += 1
        d1 += 1
        if d1 > datetime.date(y1, m1, 1).replace(day=28).day + (m1 == 2 and isUruu(y1) and d1 == 29):
            d1 = 1
            m1 += 1
        if m1 > 12:
            m1 = 1
            y1 += 1
        a = (a + 1) % 7
    return count

def isUruu(y):
    if y % 400 == 0:
        return True
    elif y % 100 == 0:
        return False
    else:
        return y % 4 == 0