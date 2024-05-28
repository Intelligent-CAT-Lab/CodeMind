n = 7
def geometric_sum_recursive(n):
  if n < 0:
    return 0
  else:
    return 1 / (pow(2, n)) + geometric_sum_recursive(n - 1)

print(geometric_sum_recursive(n))