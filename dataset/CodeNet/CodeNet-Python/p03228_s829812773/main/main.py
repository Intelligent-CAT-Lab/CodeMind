def main():
    a, b, k = [int(s) for s in input().split()]

    for i in range(k):
        if i % 2 == 0:
            a, b = play(a, b)
        else:
            b, a = play(b, a)

    print((a, b))

def play(a, b):
    return (a // 2, b + a // 2)

main()
