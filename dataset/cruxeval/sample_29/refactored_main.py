text = '-123   \t+314'
nums = list(filter(str.isnumeric, text))
assert len(nums) > 0
print(''.join(nums))