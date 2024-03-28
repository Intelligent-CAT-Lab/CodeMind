class main:
    def main():
        nums = list(map(int, input().split()))
        max_val = max(nums)
        idx = nums.index(max_val)
        print(chr(ord('A') + idx))
    
    if __name__ == "__main__":
        main()