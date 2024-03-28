import sys

def check_password(password):
    c1, c2, c3 = 0, 0, 0
    if len(password) < 6:
        return "INVALID"
    for char in password:
        if char >= '0' and char <= '9':
            c1 += 1
        elif char >= 'A' and char <= 'Z':
            c2 += 1
        else:
            c3 += 1
    if c1 > 0 and c2 > 0 and c3 > 0:
        return "VALID"
    else:
        return "INVALID"

if __name__ == "__main__":
    while True:
        password = input("Enter password: ")
        if password == "exit":
            break
        print(check_password(password))