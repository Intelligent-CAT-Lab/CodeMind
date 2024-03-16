import sys

def p02903():
    h = int(input())
    w = int(input())
    a = int(input())
    b = int(input())

    s1 = ""
    s2 = ""

    for j in range(w):
        if j < a:
            s1 += "0"
            s2 += "1"
        else:
            s1 += "1"
            s2 += "0"

    for i in range(h):
        if i < b:
            print(s1, end="")
        else:
            print(s2, end="")
        print("\n")

if __name__ == "__main__":
    p02903()