def f(nums, start, k):
    nums[start:start+k] = nums[start:start + k][::-1]
    return nums
f([1, 2, 3, 4, 5, 6], 4, 2)