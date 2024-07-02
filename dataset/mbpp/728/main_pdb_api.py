def sum_list(lst1,lst2):
  res_list = [lst1[i] + lst2[i] for i in range(len(lst1))] 
  return res_list
sum_list([10,20,30],[15,25,35])