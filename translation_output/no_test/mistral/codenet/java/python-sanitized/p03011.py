import sys

def p03011():
    P, Q, R = map(int, input().split())
    max = 0
    if P >= Q:
        if P >= R:
            max = Q + R
        else:
            max = P + Q
    elif Q >= R:
        if Q >= P:
            max = P + R
        else:
            max = Q + R
    else:
        if R >= P:
            if R >= Q:
                max = P + Q
            else:
                max = P + R
        else:
            if R >= Q:
                max = Q + R
            else:
                max = P + R
    print(max)

if __name__ == "__main__":
    p03011()