nums = [1,3,5]
first_odd = next((el for el in nums if el%2!=0),-1)
print(first_odd)