def can_arrange(arr):
    ind=-1	## ind = CLRJ
    i=1	## i = CLRJ
    while i<len(arr):	## i = CLRJ|arr = CLRJ
      if arr[i]<arr[i-1]:	## arr = CLRJ|i = CLRJ
        ind=i	## ind = CLRJ|i = CLRJ
      i+=1	## i = CLRJ
    return ind	## ind = CLRJ
