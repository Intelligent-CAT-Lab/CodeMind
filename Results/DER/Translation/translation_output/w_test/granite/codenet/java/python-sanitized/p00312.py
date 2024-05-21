import sys

def main():
    input_str = sys.stdin.readline()
    s = input_str.split(" ")
    i1 = int(s[0])
    i2 = int(s[1])

    count = i1 // i2
    count += i1 % i2
    print(count)

if __name__ == "__main__":
    main()