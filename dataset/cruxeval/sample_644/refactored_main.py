nums = [6, 1]
pos = 3
s = slice(None)
if pos % 2:
    s = slice(None, -1)
nums[s].reverse()
print(nums)