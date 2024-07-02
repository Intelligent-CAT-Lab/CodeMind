def intersection_array(array_nums1,array_nums2):
 result = list(filter(lambda x: x in array_nums1, array_nums2)) 
 return result
intersection_array([1, 2, 3, 5, 7, 8, 9, 10],[1, 2, 4, 8, 9])