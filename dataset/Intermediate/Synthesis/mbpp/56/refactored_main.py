n = 70 
rev_num = 0
while (n > 0):  
  rev_num = (rev_num * 10 + n % 10) 
  n = n // 10  
print(2 * rev_num == n + 1)