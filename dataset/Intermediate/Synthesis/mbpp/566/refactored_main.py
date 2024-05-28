n = 345
sum_digit = 0
while n > 0:
  sum_digit += n % 10
  n = int(n / 10)
print(sum_digit)