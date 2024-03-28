def main():
    N = int(input())
    while N > 0:
        sum_val = 0
        i = 1
        while True:
            sum_val += i
            if sum_val >= N:
                print(i)
                N -= i
                break
            i += 1

if __name__ == "__main__":
    main()