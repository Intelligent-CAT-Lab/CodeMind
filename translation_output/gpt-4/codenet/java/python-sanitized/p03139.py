# No need to import Scanner, Python has built-in input function.

def main():
    N = int(input())
    A = int(input())
    B = int(input())
    print(str(min(A, B)) + " " + str(max(0, A + B - N)))

if __name__ == "__main__":
    main()