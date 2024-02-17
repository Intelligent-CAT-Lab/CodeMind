nums = [1, 1, 3, 1, 3, 1]
output = []
for n in nums:
    output.append((nums.count(n), n))
output.sort(reverse=True)
print(output)