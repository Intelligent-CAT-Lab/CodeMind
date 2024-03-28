import time

start_time = time.time()

A = int(input())
B = int(input())

for i in range(B + 1, 1000000000):
    if (i & 0xFF) == 0 and time.time() - start_time > 3500:
        break
    ca = i // A + i % A
    remb = i % B
    cb = i // B + remb // A + remb % A
    if ca < cb:
        print(i)
        break
else:
    print(-1)