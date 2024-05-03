def move_one_ball(arr):
    if len(arr)==0:	## arr = CLRJ
      return True
    sorted_array=sorted(arr)	## sorted_array = CLRJ|arr = CLRJ
    my_arr=[]	## my_arr = CLRJ
    
    min_value=min(arr)	## min_value = CLRJ|arr = CLRJ
    min_index=arr.index(min_value)	## min_index = CLRJ|arr = CLRJ|min_value = CLRJ
    my_arr=arr[min_index:]+arr[0:min_index]	## my_arr = CLRJ|arr = CLRJ|min_index = CLRJ
    for i in range(len(arr)):	## i = CLRJ|arr = CLRJ
      if my_arr[i]!=sorted_array[i]:	## my_arr = CLRJ|i = CLRJ|sorted_array = CLRJ
        return False
    return True
