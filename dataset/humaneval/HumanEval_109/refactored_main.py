arr=[3, 4, 5, 1, 2]
if len(arr)==0:
    return True
sorted_array=sorted(arr)
my_arr=[]

min_value=min(arr)
min_index=arr.index(min_value)
my_arr=arr[min_index:]+arr[0:min_index]
for i in range(len(arr)):
    if my_arr[i]!=sorted_array[i]:
        return False
print(True)