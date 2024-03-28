def main():
    w, h, x, y = map(int, input().split())
    ans = float(w) * float(h) / 2
    a = 1 if (x + x == w and y + y == h) else 0
    print(f'{ans:.6f} {a}')

if __name__ == '__main__':
    main()