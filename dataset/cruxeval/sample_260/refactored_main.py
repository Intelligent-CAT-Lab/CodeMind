nums = [1, 2, 3, 4, 5, 6]
start = 4
k = 2
nums[start:start+k] = nums[start:start + k][::-1]
print(nums)