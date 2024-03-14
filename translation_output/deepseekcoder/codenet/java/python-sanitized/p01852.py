import sys

def finger_counting(n):
    count = 0
    if n > 0:
        while n >= 2:
            n /= 2
            count += 1
        count += 1
    return count

n = int(sys.stdin.readline())
print(finger_counting(n))