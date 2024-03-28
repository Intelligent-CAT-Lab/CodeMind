class main:
    def base3(n):
        if n == 0:
            return [0]
        nums = []
        while n:
            n, r = divmod(n, 3)
            nums.append(r)
        return nums[::-1]
    
    def convert_base3(n):
        nums = base3(n)
        for i in range(len(nums)):
            if nums[i] == 0:
                nums[i] = '0'
            elif nums[i] > 0:
                nums[i] = '+'
            else:
                nums[i] = '-'
        return ''.join(nums)
    
    n = int(input())
    print(convert_base3(n))