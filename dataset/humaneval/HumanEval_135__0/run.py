from typing import *
def can_arrange(arr):
    ind=-1
    i=1
    while i<len(arr):
      if arr[i]<arr[i-1]:
        ind=i
      i+=1
    return ind

output = can_arrange([1,2,4,5])
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_135__0/output.txt", 'w')
file.write(str(output))
file.close()
    