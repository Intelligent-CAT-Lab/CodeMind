import re

def main():
    S = input()
    S = re.sub("eraser|erase|dreamer|dream", "-", S)
    if len(S.replace("-", "")) == 0:
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()