def main():
    x = int(input())
    lst = []

    while x > 0:
        r = x % 10
        if 9 - r < r:
            if x // 10 == 0 and 9 - r == 0:
                lst.append(r)
            else:
                lst.append(9 - r)
        else:
            lst.append(r)
        
        x = x // 10

    pow_val = 0
    new_number = 0

    for i in range(len(lst)):
        new_number += lst[i] * (10 ** pow_val)
        pow_val += 1

    print(new_number)

if __name__ == "__main__":
    main()