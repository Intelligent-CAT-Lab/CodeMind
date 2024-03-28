# Python doesn't require explicit imports for basic functionality like input and print
def main():
    a = int(input())
    s = input()
    b = int(input())

    if s == "+":
        c = a + b
    elif s == "-":
        c = a - b

    print(c, end='')

# Invoke the main function
if __name__ == "__main__":
    main()