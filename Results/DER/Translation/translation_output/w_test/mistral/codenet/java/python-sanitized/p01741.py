def p01741():
    d = float(input())
    if d < 1:
        print(d * math.sqrt(2))
    elif d < math.sqrt(2):
        print("2")
    elif d < 2:
        print(d * math.sqrt(2))
    elif d < math.sqrt(2) *