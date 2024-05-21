import sys

def main():
    n = int(sys.stdin.readline())
    eratosu = [0] * 100000
    for i in range(1, 101):
        for j in range(1, 101):
            for k in range(1, 101):
                result = i * i + j * j + k * k + i * j + j * k + k * i
                if result < 100000:
                    eratosu[result] += 1

    print(eratosu[1])
    for i in range(2, n + 1):
        print(eratosu[i])

if __name__ == "__main__":
    main()