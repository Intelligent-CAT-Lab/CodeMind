a = [-2, -3, 4, -1, -2, 1, 5, -3]
size = 8
max_so_far = 0
max_ending_here = 0
for i in range(0, size):
  max_ending_here = max_ending_here + a[i]
  if max_ending_here < 0:
    max_ending_here = 0
  elif (max_so_far < max_ending_here):
    max_so_far = max_ending_here
print(max_so_far)