class main:
    import sys
    
    def solve(a, b, k):
        nums = set()
        for i in range(a, b+1):
            if len(nums) >= k:
                break
            nums.add(i)
        for i in range(b, a-1, -1):
            if len(nums) >= k:
                break
            nums.add(i)
        for num in sorted(nums):
            print(num)
    
    def main():
        a, b, k = map(int, sys.stdin.readline().split())
        solve(a, b, k)
    
    if __name__ == "__main__":
        main()