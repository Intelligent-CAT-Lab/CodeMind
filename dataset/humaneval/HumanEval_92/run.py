from typing import *
def any_int(x, y, z):
    
    if isinstance(x,int) and isinstance(y,int) and isinstance(z,int):
        if (x+y==z) or (x+z==y) or (y+z==x):
            return True
        return False
    return False

output = any_int(2, 3, 1)
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_92/output.txt", 'w')
file.write(str(output))
file.close()
    