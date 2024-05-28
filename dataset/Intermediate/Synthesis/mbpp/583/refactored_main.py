num = 10
if num <=1:
     print(1) 
res_num = 0
for i in range(num):
    res_num += catalan_number(i) * catalan_number(num-i-1)
print(res_num)