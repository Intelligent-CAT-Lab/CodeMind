nums = [5, 15, 37, 25, 79]
shrink_fact = 1.3
gaps = len(nums)
swapped = True
i = 0
while gaps > 1 or swapped:
    gaps = int(float(gaps) / shrink_fact)
    swapped = False
    i = 0
    while gaps + i < len(nums):
        if nums[i] > nums[i+gaps]:
            nums[i], nums[i+gaps] = nums[i+gaps], nums[i]
            swapped = True
        i += 1
print(nums)