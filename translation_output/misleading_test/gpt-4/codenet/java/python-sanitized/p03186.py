def main():
    A, B, C = map(int, input().split())

    max_sum = B + C

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

    print(max_sum - C + 1 if C > 0 else max_sum)

if __name__ == "__main__":
    main()