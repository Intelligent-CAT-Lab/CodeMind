class main:
    import re
    
    def check_string(s):
        pat = r"A?KIHA?BA?RA?"
        if re.match(pat, s):
            return "YES"
        else:
            return "NO"
    
    # Test input
    s = input()
    print(check_string(s))