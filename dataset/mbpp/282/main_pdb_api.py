def sub_list(nums1,nums2):
  result = map(lambda x, y: x - y, nums1, nums2)
  return list(result)
sub_list([1, 2, 3],[4,5,6])