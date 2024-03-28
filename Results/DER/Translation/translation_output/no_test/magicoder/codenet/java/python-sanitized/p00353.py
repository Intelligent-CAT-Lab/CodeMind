import sys

def main():
    input_line = sys.stdin.readline().split()
    m = int(input_line[0])
    f = int(input_line[1])
    b = int(input_line[2])

    if b > m + f:
        print("NA")
    elif b > m:
        print(b - m)
    else:
        print("0")

if __name__ == "__main__":
    main()