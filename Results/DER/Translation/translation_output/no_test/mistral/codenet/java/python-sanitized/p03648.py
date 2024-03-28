import sys

def fast_scanner():
    sys.stdin.buffer = bytearray(1024)
    ptr, buflen = 0, 0
    while True:
        if ptr < buflen:
            yield ptr
            ptr += 1
        else:
            buflen = sys.stdin.read(1024)
            if buflen <= 0:
                break

K = int(fast_scanner())
A = K // 50
B = K % 50

a = [i + A for i in range(50)]

for i in range(49, -1, -B):
    a[i] += 1

print(50)
for i in range(50):
    print(a[i], end=' ')
print()