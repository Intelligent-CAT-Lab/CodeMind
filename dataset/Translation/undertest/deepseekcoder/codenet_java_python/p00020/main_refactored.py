class main:
    import sys
    
    def convert_to_uppercase(s):
        t = ""
        for c in s:
            if 'a' <= c <= 'z':
                t += chr(ord(c) - 32)
            else:
                t += c
        return t
    
    for line in sys.stdin:
        print(convert_to_uppercase(line.strip()))