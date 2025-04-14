from typing import *
def simplify(x, n):
    a, b = x.split("/")
    c, d = n.split("/")
    numerator = int(a) * int(c)
    denom = int(b) * int(d)
    if (numerator/denom == int(numerator/denom)):
        return True
    return False

output = simplify("2/4", "8/4")
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_144__0/output.txt", 'w')
file.write(str(output))
file.close()
    