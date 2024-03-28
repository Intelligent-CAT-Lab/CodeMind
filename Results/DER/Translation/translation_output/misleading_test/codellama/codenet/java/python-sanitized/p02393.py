import sys

def main():
    nums = sys.stdin.readline().split()
    nums.sort()
    print(" ".join(nums))

if __name__ == "__main__":
    main()



$ python3 test.py
3 8 1
-43 -40 -49