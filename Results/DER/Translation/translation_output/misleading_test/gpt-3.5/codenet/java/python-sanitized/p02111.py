def p02111():
    n = int(input())
    minute = 12 * 60 * n // 360
    print(minute // 60, minute % 60)

# Test
p02111()