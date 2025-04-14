from typing import *
def is_happy(s):
    if len(s) < 3:
      return False

    for i in range(len(s) - 2):
      
      if s[i] == s[i+1] or s[i+1] == s[i+2] or s[i] == s[i+2]:
        return False
    return True

output = is_happy("xyy")
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_80__1/output.txt", 'w')
file.write(str(output))
file.close()
    