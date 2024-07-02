def odd_position(nums):
	return all(nums[i]%2==i%2 for i in range(len(nums)))
odd_position([2,1,4,3,6,7,6,3])