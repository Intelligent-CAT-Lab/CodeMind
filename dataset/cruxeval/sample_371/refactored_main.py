nums = [11, 21, 0, 11]
for odd in nums[:]:
    if odd % 2 != 0:
        nums.remove(odd)
sum_ = 0
for num in nums:
    sum_ += num
print(sum_)