# Sample test case
nums = [1000, 900, 850]

# Expected output
output = chr(ord('A') + nums.index(max(nums)))

# Code
nums = list(map(int, input().split()))
max = nums[0]
idx = nums.index(max)
output = chr(ord('A') + idx)
print(output)