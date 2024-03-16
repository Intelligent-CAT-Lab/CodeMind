def main():
    h, w, a, b = map(int, input().split())

    for i in range(h):
        for j in range(w):
            x = 1 if (j < a) ^ (i < b) else 0
            print(x, end='')
        print()  # This will automatically add a newline character

if __name__ == "__main__":
    main()