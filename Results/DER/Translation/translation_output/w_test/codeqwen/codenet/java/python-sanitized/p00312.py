def main():
    str1 = input()
    s = str1.split(" ")
    i1 = int(s[0])
    i2 = int(s[1])

    count = i1 // i2
    count += i1 % i2
    print(count)

if __name__ == "__main__":
    main()