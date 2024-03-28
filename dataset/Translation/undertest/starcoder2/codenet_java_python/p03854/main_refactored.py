class main:
    import re
    
    S = input()
    S = re.sub(r"eraser", "-", S)
    S = re.sub(r"erase", "-", S)
    S = re.sub(r"dreamer", "-", S)
    S = re.sub(r"dream", "-", S)
    S = re.sub(r"-", "", S)
    if len(S) == 0:
        print("YES")
    else:
        print("NO")