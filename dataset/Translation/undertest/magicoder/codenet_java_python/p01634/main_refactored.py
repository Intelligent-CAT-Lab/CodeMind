class main:
    import sys
    
    def check_password(password):
        if len(password) < 6:
            return "INVALID"
        else:
            has_digit = any(char.isdigit() for char in password)
            has_uppercase = any(char.isupper() for char in password)
            has_special = any(not char.isalnum() for char in password)
            if has_digit and has_uppercase and has_special:
                return "VALID"
            else:
                return "INVALID"
    
    for line in sys.stdin:
        line = line.strip()
        if line:
            print(check_password(line))