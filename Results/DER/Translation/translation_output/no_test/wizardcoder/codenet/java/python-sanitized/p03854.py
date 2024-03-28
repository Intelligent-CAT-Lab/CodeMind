import re

def main():
    S = input()
    S = re.sub("eraser", "-", S)
    S = re.sub("erase", "-", S)
    S = re.sub("dreamer", "-", S)
    S = re.sub("dream", "-", S)
    S = re.sub("-", "", S)
    if len(S) == 0:
        print("YES")
    else:
        print("NO")

if __name__ == '__main__':
    main()