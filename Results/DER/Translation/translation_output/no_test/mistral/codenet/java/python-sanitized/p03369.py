import sys

def gs():
    return input()

def gi():
    return int(input())

def gl():
    return long(input())

def gd():
    return float(input())

if __name__ == "__main__":
    s = gs()
    print((len(s) - s.replace("o", "").length()) * 100 + 700)