nums1 = [1, 2, 3, 4, 5, 6]
nums2 = [3, 6, 8, 9, 10, 6]
N = 3

result = sorted([x*y for x in nums1 for y in nums2], reverse=True)[:N]
print(result)