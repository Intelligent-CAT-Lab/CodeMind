import sys

def is_valid_password(password):
    if len(password) < 6:
        return "INVALID"
    else:
        num_digits = 0
        num_uppercase = 0
        num_special = 0
        for char in password:
            if char.isdigit():
                num_digits += 1
            elif char.isupper():
                num_uppercase += 1
            else:
                num_special += 1
        if num_digits > 0 and num_uppercase > 0 and num_special > 0:
            return "VALID"
        else:
            return "INVALID"

if __name__ == "__main__":
    password = sys.stdin.readline().strip()
    print(is_valid_password(password))