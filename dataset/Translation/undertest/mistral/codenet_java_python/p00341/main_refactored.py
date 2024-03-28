class main:
    import sys
    
    def main():
        n = int(input())
        nums = list(map(int, input().split()))
        nums.sort()
        distinct = list(set(nums))
        if len(distinct) > 3:
            print("no")
            return
        for num in distinct:
            count = nums.count(num)
            if count != 4 and count != 8 and count != 12:
                print("no")
                return
        print("yes")
    
    if __name__ == "__main__":
        main()