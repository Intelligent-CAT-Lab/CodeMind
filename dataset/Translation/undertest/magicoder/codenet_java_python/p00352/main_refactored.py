class main:
    import sys
    
    def main():
        nums = list(map(int, sys.stdin.readline().split()))
        print(sum(nums) // 2)
    
    if __name__ == "__main__":
        main()