def sorted_numbers(nums):
    sorted_nums = sorted(nums)
    return ' '.join(str(num) for num in sorted_nums)

if __name__ == "__main__":
    strNumList = input().split()
    
    intNumList = [int(num) for num in strNumList]
    print(sorted_numbers(intNumList))