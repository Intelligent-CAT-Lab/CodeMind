def main():
    K = int(input())
    A = K // 50
    B = K % 50

    a = [i + A for i in range(50)]

    for i in range(49, 49 - B, -1):
        a[i] += 1

    print(50)
    print(' '.join(str(x) for x in a))

if __name__ == "__main__":
    main()