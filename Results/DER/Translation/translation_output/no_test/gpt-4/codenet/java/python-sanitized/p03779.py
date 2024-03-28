# No import needed for standard input

def main():
    x = int(input())
    ans = 0

    for i in range(100000):
        if x <= i * (i + 1) // 2:
            ans = i
            break

    print(ans)

if __name__ == "__main__":
    main()