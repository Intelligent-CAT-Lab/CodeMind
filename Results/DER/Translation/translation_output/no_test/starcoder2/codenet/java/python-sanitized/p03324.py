import sys

def search(a,b):
    o = 0
    if a%1000000 == 0:
        o = 3
    elif a%10000 == 0:
        o = 2
    elif a%100 == 0:
        o = 1
    if b == o:
        return True
    else:
        return False

D = int(sys.stdin.readline())
A = 10000 if D == 2 else 100 if D == 1 else 1
N = int(sys.stdin.readline())
ser = 0
count = 0
while ser < N:
    count += 1
    if search(count*A,D):
        ser += 1
print(count*A)