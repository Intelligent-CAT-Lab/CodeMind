import re

def check_password(password):
    if len(password) < 6:
        return "INVALID"
    else:
        if re.search(r'\d', password) and re.search(r'[A-Z]', password) and re.search(r'[^A-Za-z0-9]', password):
            return "VALID"
        else:
            return "INVALID"

password = input()
print(check_password(password))