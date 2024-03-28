import re

def is_dream_possible(S):
    if re.search(r"dreamer|dream", S):
        return False
    return True

def erase_dream(S):
    S = re.sub(r"eraser|erase", "-", S)
    S = re.sub(r"dreamer|dream", "-", S)
    S = re.sub(r"-", "", S)
    return S

S = input()
if is_dream_possible(S):
    print("YES")
    print(erase_dream(S))
else:
    print("NO")