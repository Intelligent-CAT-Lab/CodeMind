def main():
    x = int(input())
    next = 2
    for i in range(x):
        next = (next + 1) * 2
    print(next)

if __name__ == "__main__":
    main()