def main():
    N = int(input())
    while N > 0:
        sum_ = 0
        i = 1
        while True:
            sum_ += i
            if sum_ >= N:
                print(i)
                N -= i
                break
            i += 1

if __name__ == '__main__':
    main()