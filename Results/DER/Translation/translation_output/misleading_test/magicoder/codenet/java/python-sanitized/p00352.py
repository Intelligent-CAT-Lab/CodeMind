import sys

def main():
    nums = list(map(int, sys.stdin.readline().split()))
    print((nums[0] + nums[1]) // 2)

if __name__ == "__main__":
    main()