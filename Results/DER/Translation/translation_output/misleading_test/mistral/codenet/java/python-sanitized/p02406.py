import sys

def p02406():
    n = int(input())
    sb = StringBuilder()
    count = 0
    a = 1
    if 3 <= n <= 10000:
        while count < n:
            b = a // 10
            if a % 3 == 0:
                sb.append(" ")
                sb.append(a)
            else:
                b = a
                while b != 0:
                    if b % 10 == 3:
                        sb.append(" ")
                        sb.append(a)
                        break
                    b //= 10
            a += 1
    print(sb)

if __name__ == "__main__":
    p02406()