import sys

def main():
    # Read input from stdin
    overLimit, prevDay, overDay = map(int, sys.stdin.readline().split())

    # Check if the previous day is greater than or equal to the overDay
    if prevDay >= overDay:
        print("delicious")
    # Check if the previous day plus the overLimit is less than the overDay
    elif prevDay + overLimit < overDay:
        print("dangerous")
    # Otherwise, the fish is safe
    else:
        print("safe")

if __name__ == "__main__":
    main()