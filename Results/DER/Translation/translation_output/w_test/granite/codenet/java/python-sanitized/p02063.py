import time

def main():
    A, B = map(int, input().split())
    start_time = time.time()
    for i in range(B + 1, 10**18):
        ca = i // A + i % A
        remb = i % B
        cb = i // B + remb // A + remb % A
        if ca < cb:
            print(i)
            return
    print(-1)

if __name__ == "__main__":
    main()