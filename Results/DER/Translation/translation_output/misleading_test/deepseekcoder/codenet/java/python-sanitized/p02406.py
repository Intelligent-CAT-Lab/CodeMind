import sys

def main(x):
    count = 0
    a = 1
    result = []
    if 3 <= x <= 10000:
        while count < x:
            b = a // 10
            if a % 3 == 0:
                result.append(a)
            else:
                b = a
                while b != 0:
                    if b % 10 == 3:
                        result.append(a)
                        break
                    b = b // 10
            a += 1
            count += 1
    return result

if __name__ == "__main__":
    x = int(sys.stdin.readline())
    print(*main(x))