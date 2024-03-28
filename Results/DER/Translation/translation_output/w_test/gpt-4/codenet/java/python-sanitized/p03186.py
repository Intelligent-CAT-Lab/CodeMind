def main():
    A, B, C = map(int, input().split())

    max_val = B + C

    if C >= B:
        C -= B
        B = 0
    else:
        B -= C
        C = 0

    if C >= A:
        C -= A
    else:
        C = 0

    print(max_val - C + 1 if C > 0 else max_val)

if __name__ == '__main__':
    main()