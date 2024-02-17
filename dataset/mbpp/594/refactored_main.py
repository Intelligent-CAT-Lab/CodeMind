list1 = [1,3,5,7,4,1,6,8]
first_even = next((el for el in list1 if el%2==0),-1)
first_odd = next((el for el in list1 if el%2!=0),-1)
print (first_even-first_odd)