def main():
    n = int(input())
    square = n * n
    odd = []
    even = []

    for i in range(1, square + 1):
        if i % 2 == 0:
            even.append(i)
        else:
            odd.append(i)

    loop = square // n
    div = loop // 2
    # debug(div)

    for i in range(1, loop + 1):
        for j in range(div):
            if i % 2 == 1:
                print(odd.pop(0), even.pop(-1), end=" ")
            else:
                print(even.pop(0), odd.pop(-1), end=" ")
        print()

# Removed the debug function as it is not required in the Python solution.
# In Python, you can use print or logging for debugging purposes.


if __name__ == '__main__':
    main()