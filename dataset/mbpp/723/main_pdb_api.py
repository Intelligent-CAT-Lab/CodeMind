from operator import eq
def count_same_pair(nums1, nums2):
    result = sum(map(eq, nums1, nums2))
    return result
count_same_pair([1, 2, 3, 4, 5, 6, 7, 8],[2, 2, 3, 1, 2, 6, 7, 9])