num_list = [1,0,2,0,3,4]
a = [0 for i in range(num_list.count(0))]
x = [i for i in num_list if i != 0]
print(x + a)