import sys

def main():
    n = int(sys.stdin.readline().strip())
    eratosu = [0] * 100000
    for i in range(1, 100):
        for j in range(1, 100):
            for k in range(1, 100):
                if i * i + j * j + k * k >= 100000:
                    continue
                result = i * i + j * j + k * k + i * j + j * k + k * i
                eratosu[result] += 1
    s = str(eratosu[1])
    sb = StringBuilder(s)
    for i in range(2, n + 1):
        sb.append("\n" + str(eratosu[i]))
    print(sb.toString())

if __name__ == "__main__":
    main()