nums = [15, 79, 25, 38, 69]
arr_len = len(nums)
while arr_len > 1:
    mi = nums.index(max(nums[0:arr_len]))
    nums = nums[mi::-1] + nums[mi+1:len(nums)]
    nums = nums[arr_len-1::-1] + nums[arr_len:len(nums)]
    arr_len -= 1
print(nums)