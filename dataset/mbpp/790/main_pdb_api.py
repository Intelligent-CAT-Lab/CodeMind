def even_position(nums):
	return all(nums[i]%2==i%2 for i in range(len(nums)))
even_position([3,2,1])