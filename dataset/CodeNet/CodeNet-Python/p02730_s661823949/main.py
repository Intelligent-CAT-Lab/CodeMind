def check(s):
    for i  in range(len(s)//2):
        if s[i] != s[len(s)-i-1]:
            return False
    return True

if __name__ == '__main__':
    s = input()
    if check(s):
        if check(s[0:len(s)//2]):
            if check(s[(len(s)//2)+1:len(s)]):
                print("Yes")
            else:
                print("No")
        else:
            print("No")
    else:
        print("No")

