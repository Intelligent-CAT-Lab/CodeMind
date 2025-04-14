from typing import *
def Strongest_Extension(class_name, extensions):
    strong = extensions[0]
    my_val = len([x for x in extensions[0] if x.isalpha() and x.isupper()]) - len([x for x in extensions[0] if x.isalpha() and x.islower()])
    for s in extensions:
        val = len([x for x in s if x.isalpha() and x.isupper()]) - len([x for x in s if x.isalpha() and x.islower()])
        if val > my_val:
            strong = s
            my_val = val

    ans = class_name + "." + strong
    return ans


output = Strongest_Extension('Sp', ['671235', 'Bb'])
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_153__0/output.txt", 'w')
file.write(str(output))
file.close()
    