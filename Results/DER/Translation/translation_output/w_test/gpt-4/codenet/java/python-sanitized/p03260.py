def check_odd_product():
    values = input().split()
    n = int(values[0])
    k = int(values[1])

    if (n * k) % 2 == 1:
        print("Yes")
    else:
        print("No")

check_odd_product()