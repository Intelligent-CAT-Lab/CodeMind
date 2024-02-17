nums = [0, 0, 1, 2, 1]
for i in range(len(nums) - 1, -1, -3):
    if nums[i] == 0:
        nums.clear()
        print(False)
        break
else:
    print(nums)