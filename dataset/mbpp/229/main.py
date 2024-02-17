def re_arrange_array(arr, n):
  j=0
  for i in range(0, n):
    if (arr[i] < 0):
      temp = arr[i]
      arr[i] = arr[j]
      arr[j] = temp
      j = j + 1
  return arr