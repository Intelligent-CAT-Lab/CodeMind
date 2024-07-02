def div_list(nums1,nums2):
  result = map(lambda x, y: x / y, nums1, nums2)
  return list(result)
div_list([4,5,6],[1, 2, 3])