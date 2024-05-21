import time

A, B = map(int, input().split())
start_time = time.time()

for i in range(B + 1, 10**18):
    ca = i // A + i % A
    remb = i % B
    cb = i // B + remb // A + remb % A
    if ca < cb:
        print(i)
        exit()
    if (i & 0xFF) == 0 and time.time() - start_time > 0.35:
        print(-1)
        exit()