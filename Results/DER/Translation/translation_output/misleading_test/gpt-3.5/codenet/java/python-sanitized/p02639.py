def main():
    x = list(map(int, input().split()))
    sum_val = 0
    for i in range(5):
        sum_val += x[i]
    print(15 - sum_val)

if __name__ == "__main__":
    main()