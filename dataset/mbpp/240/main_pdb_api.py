def replace_list(list1,list2):
 list1[-1:] = list2
 replace_list=list1
 return replace_list

replace_list([1, 3, 5, 7, 9, 10],[2, 4, 6, 8])