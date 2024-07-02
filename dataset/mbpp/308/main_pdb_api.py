def large_product(nums1, nums2, N):
    result = sorted([x*y for x in nums1 for y in nums2], reverse=True)[:N]
    return result
large_product([1, 2, 3, 4, 5, 6],[3, 6, 8, 9, 10, 6],3)