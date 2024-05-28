str = 'program2bedone'
number_ctr= 0
for i in range(len(str)):
    if str[i] >= '0' and str[i] <= '9': number_ctr += 1     
print(number_ctr)