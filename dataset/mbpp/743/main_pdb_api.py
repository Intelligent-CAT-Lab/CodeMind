def rotate_right(list, m):
  result =  list[-m:] + list[:-m]
  return result
rotate_right([1, 2, 3, 4, 5, 6, 7, 8, 9, 10],3)