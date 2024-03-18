# Python doesn't require an import for basic input/output operations

def main():
    # Reading input in Python using input().split()
    str_input = input().split()

    # Parsing to integers
    n = int(str_input[0])
    k = int(str_input[1])

    # Creating the list with initial values of 0 for Python equivalent of Java's array
    num = [0] * k

    # Python uses 0-based indexing
    for i in range(1, n + 1):
        num[i % k] += 1

    res = 0
    # Python's range is also 0-index based and the loop goes until k (not inclusive)
    for a in range(k):
        b = (k - a) % k
        c = (k - a) % k
        if (b + c) % k != 0:
            continue
        res += num[a] * num[b] * num[c]

    # Printing result in Python
    print(res)

# Calling the main function only if this script is executed as standalone
if __name__ == "__main__":
    main()