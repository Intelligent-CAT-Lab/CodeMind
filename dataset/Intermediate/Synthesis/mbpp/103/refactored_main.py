n = 3
m = 1
if (m >= n or n == 0): 
    output = 0 
if (m == 0): 
    output = 1 
output = ((n - m) * eulerian_num(n - 1, m - 1) +(m + 1) * eulerian_num(n - 1, m))
print(output)