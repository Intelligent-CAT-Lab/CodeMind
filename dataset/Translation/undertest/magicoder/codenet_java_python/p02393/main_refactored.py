class main:
    import sys
    
    def main():
        nums = list(map(int, sys.stdin.readline().split()))
        nums.sort()
        print(nums[0], nums[1], nums[2])
    
    if __name__ == "__main__":
        main()