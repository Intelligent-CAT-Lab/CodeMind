import sys

def main():
    a, b, c = map(int, sys.stdin.readline().split())

    nums = [a, b, c]
    nums.sort()

    print(nums[0] + nums[1])

if __name__ == "__main__":
    main()