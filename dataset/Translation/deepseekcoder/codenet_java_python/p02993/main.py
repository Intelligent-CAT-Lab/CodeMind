import sys

def main():
    s = sys.stdin.readline().strip()
    flag = False
    for i in range(len(s)-1):
        if s[i] == s[i+1]:
            flag = True
            break
    if flag:
        print("Bad")
    else:
        print("Good")

if __name__ == "__main__":
    main()