class main:
    import re
    
    def saiki(s):
        if not s:
            return True
        if s[0] != 'm':
            return False
        en = 1
        i = 1
        while i < len(s) and en != 0:
            if s[i] == 'm':
                en += 1
            elif s[i] == 'e':
                en -= 1
            i += 1
        if i == len(s):
            return False
        eindex = i
        mn = 1
        i += 1
        while i < len(s) and mn != 0:
            if s[i] == 'e':
                mn += 1
            elif s[i] == 'w':
                mn -= 1
            i += 1
        if i != len(s):
            return False
        return saiki(s[1:eindex-1]) and saiki(s[eindex:len(s)-1])
    
    def main():
        s = input("Enter a string: ")
        if saiki(s):
            print("Cat")
        else:
            print("Rabbit")
    
    if __name__ == "__main__":
        main()