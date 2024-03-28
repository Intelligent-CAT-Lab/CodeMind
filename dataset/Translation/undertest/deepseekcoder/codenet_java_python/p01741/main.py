import math

def run(d):
    if d < 1:
        return d * math.sqrt(2)
    elif d < math.sqrt(2):
        return 2
    elif d < 2:
        return d * math.sqrt(2)
    elif d < math.sqrt(2) *