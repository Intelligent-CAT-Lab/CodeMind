# No need to import anything for taking input in Python

# Defining the main function, it's not necessary in Python but used here for structural similarity
def main():
    X = int(input())  # Reading the first number
    Y = int(input())  # Reading the second number

    if X % 2 == 0 or Y % 2 == 0:
        print("Even")
        return  # 'return' is not necessary, as the function will exit after this line anyway
    print("Odd")

# Checking if the script is run directly (not being imported)
if __name__ == "__main__":
    main()