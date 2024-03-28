# No need to import anything for input in Python

def main():
    ary = input()  # Reads the entire line as a string
    num = 0
    for c in ary:
        if c == '+':
            num += 1
        else:
            num -= 1
    print(num)

if __name__ == "__main__":
    main()