def main():
    n, a, b = map(int, "4 4 6".split())
    if b - a < 0 or n == 1 and b - a > 0:
        print(0)
    elif n == 1:
        print(1)
    else:
        print((n-2)*(b-a)+1)
if __name__ == "__main__":
    main()
