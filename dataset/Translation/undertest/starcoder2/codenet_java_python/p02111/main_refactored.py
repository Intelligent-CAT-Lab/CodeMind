class main:
    n = int(input())
    minute = 12 * 60 * n / 360
    print(int(minute / 60), int(minute % 60))