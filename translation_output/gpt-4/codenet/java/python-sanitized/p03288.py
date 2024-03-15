# No import needed for basic input in Python

def main():
    r = int(input())  # Reading the long input as int since Python can handle very large integers
    if r < 1200:
        print("ABC")
    elif r < 2800:
        print("ARC")
    else:
        print("AGC")

if __name__ == "__main__":
    main()