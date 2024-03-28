import sys

def p02720():
    k = int(input())
    list = [i for i in range(1, 10)]
    val = -1
    while k > 0:
        val = list.pop(0)
        if val % 10 != 0:
            list.append(10 * val + val % 10 - 1)
        list.append(10 * val + val % 10)
        if val % 10 != 9:
            list.append(10 * val + val % 10 + 1)
        k -= 1
    print(val)

if __name__ == "__main__":
    p02720()