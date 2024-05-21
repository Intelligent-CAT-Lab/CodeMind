import sys

def translate_java_to_python(x1, y1, x2, y2):
    a = x2 - x1
    b = y2 - y1
    x3 = x2 - b
    y3 = y2 + a
    x4 = x3 - a
    y4 = y3 - b
    return f"{x3} {y3} {x4} {y4}"

def main():
    x1, y1, x2, y2 = map(int, sys.stdin.readline().split())
    result = translate_java_to_python(x1, y1, x2, y2)
    print(result)

if __name__ == "__main__":
    main()