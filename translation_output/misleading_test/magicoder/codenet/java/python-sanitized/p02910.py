def main():
    N = input()

    for i in range(len(N)):
        c = N[i]
        if i % 2 == 0:
            if c =='L':
                print("No")
                return
        else:
            if c =='R':
                print("No")
                return
        if i == len(N) - 1:
            print("Yes")

if __name__ == "__main__":
    main()