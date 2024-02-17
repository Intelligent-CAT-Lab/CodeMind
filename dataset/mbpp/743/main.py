def rotate_right(list, m):
  result =  list[-m:] + list[:-m]
  return result