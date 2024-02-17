nums = [2,1,4,3,6,7,6,3]
print(all(nums[i]%2==i%2 for i in range(len(nums))))