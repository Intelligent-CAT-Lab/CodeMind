# No need to import any specific module for input in Python

def main():
    a = int(input())
    b = int(input())
    if a % 3 == 0 or b % 3 == 0 or (a + b) % 3 == 0:
        print("Possible")
    else:
        print("Impossible")

if __name__ == "__main__":
    main()