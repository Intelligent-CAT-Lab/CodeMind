import sys

def main():
    input_str = sys.stdin.readline().strip()
    numlist = input_str.split(" ")
    Sheep = int(numlist[0])
    Wolve = int(numlist[1])

    if Wolve >= Sheep:
        print("unsafe")
    else:
        print("safe")

if __name__ == "__main__":
    main()