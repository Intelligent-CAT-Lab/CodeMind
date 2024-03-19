# Sample test case
nums = [1000, 900, 850]

# Expected output
print(chr(ord('A') + nums.index(max(nums))))

# Solution
nums = list(map(int, input().split()))
max = nums[0]
idx = nums.index(max)
print(chr(ord('A') + idx))