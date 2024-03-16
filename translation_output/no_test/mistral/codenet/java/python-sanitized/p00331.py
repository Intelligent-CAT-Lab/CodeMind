import sys

def main():
    while True:
        try:
            H = int(input())
            R = int(input())
            break
        except ValueError:
            print("Invalid input. Please enter integers only.")

    if H < 0 and abs(H) == R:
        print(0)
    elif H + R > 0:
        print(1)
    else:
        print(-1)

if __name__ == "__main__":
    main()