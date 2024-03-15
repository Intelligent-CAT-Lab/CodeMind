import sys
import time

startTime = time.time()

def main():
    A = int(input())
    B = int(input())
    i = B + 1
    while True:
        if (i & 0xFF) == 0 and (time.time() - startTime) > 3.5:
            break
        ca = i // A + i % A
        remb = i % B
        cb = i // B + remb // A + remb % A
        if ca < cb:
            print(i)
            return
        i += 1
    print(-1)

if __name__ == "__main__":
    main()