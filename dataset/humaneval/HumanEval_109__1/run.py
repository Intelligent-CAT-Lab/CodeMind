from typing import *
def move_one_ball(arr):
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
    return True

output = move_one_ball([3, 5, 4, 1, 2])
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_109__1/output.txt", 'w')
file.write(str(output))
file.close()
    