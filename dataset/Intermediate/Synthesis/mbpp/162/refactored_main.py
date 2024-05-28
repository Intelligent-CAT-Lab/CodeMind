n = 6
if n < 1:
  return_value = 0
else:
  return_value = n + sum_series(n - 2)
print(return_value)