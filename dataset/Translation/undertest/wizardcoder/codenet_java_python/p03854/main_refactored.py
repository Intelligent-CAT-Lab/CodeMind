class main:
    import re
    
    S = input()
    S = re.sub("eraser", "-", S)
    S = re.sub("erase", "-", S)
    S = re.sub("dreamer", "-", S)
    S = re.sub("dream", "-", S)
    S = re.sub("-", "", S)
    if S == "":
        print("YES")
    else:
        print("NO")