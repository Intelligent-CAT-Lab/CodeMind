class main:
    import re
    
    def check(s):
        pattern = r"A{0,1}KIHA{0,1}BA{0,1}RA{0,1}"
        if re.search(pattern, s):
            return "YES"
        else:
            return "NO"
    
    s = input()
    print(check(s))