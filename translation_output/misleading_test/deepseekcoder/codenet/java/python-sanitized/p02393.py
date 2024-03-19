import sys

def main():
    line = sys.stdin.readline().strip()
    nums = list(map(int, line.split()))
    nums.sort()
    print(nums[0], nums[1], nums[2])

if __name__ == "__main__":
    main()