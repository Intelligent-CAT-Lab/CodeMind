# no need for an import statement for basic input/output in Python

def main():
    X = int(input())  # reads the first input as an integer
    Y = int(input())  # reads the second input as an integer

    i = 0
    while X <= Y:
        i += 1
        X *= 2

    print(i)

if __name__ == "__main__":
    main()