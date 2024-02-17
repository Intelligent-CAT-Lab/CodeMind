num = 99
import sys
numstr = str(num)
for i in range(num+1,sys.maxsize):
    if str(i) == str(i)[::-1]:
        new_num = i
print(new_num)