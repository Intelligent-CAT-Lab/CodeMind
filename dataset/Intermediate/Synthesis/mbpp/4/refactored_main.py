import heapq as hq

nums = [25, 35, 22, 85, 14, 65, 75, 22, 58]
n = 3
largest_nums = hq.nlargest(n, nums)
print(largest_nums)