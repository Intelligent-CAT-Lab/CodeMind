def remove_kth_element(list1, L):
    return  list1[:L-1] + list1[L:]
remove_kth_element([1,1,2,3,4,4,5,1],3)