list1 = [22.4, 4.0, -16.22, -9.10, 11.00, -12.22, 14.20, -5.20, 17.50]
lenght=len(list1)
round_and_sum=sum(list(map(round,list1))* lenght)
print(round_and_sum)