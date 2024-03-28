def main():
    # Input reading
    N = int(input()) + 1

    # Translating the processing logic from Java to Python
    s = str(N)
    length = len(s)
    c = int(s[0])
    max_num = (c - 1) + 9 * (length - 1)

    # Output the result
    print(max_num)

if __name__ == "__main__":
    main()