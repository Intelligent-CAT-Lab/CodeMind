def intersection_array(array_nums1,array_nums2):
 result = list(filter(lambda x: x in array_nums1, array_nums2)) 
 return result