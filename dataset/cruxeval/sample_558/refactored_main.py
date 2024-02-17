nums = [3, 1, 2, 1, 4, 1]
mos = [1]
for num in mos:
    nums.pop(nums.index(num))
nums.sort()
for num in mos:
    nums += [num]
for i in range(len(nums)-1):
    if nums[i] > nums[i+1]:
        print(False)
        break
else:
    print(True)