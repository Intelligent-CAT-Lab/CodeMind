class main:
    import sys
    
    def check_password_validity(password):
        c1, c2, c3 = 0, 0, 0
        if len(password) < 6:
            return "INVALID"
        else:
            for c in password:
                if c.isdigit():
                    c1 += 1
                elif c.isupper():
                    c2 += 1
                else:
                    c3 += 1
            if c1 > 0 and c2 > 0 and c3 > 0:
                return "VALID"
            else:
                return "INVALID"
    
    for line in sys.stdin:
        line = line.strip()
        if not line:
            break
        print(check_password_validity(line))