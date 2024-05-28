nums = [3,2,1]
print(all(nums[i]%2==i%2 for i in range(len(nums))))