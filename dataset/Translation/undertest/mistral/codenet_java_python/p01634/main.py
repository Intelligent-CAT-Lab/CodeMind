import sys

def check_password(password):
    if len(password) < 6:
        return "INVALID"
    count = 0
    for char in password:
        if char.isdigit():
            count += 1
        elif char.isupper():
            count += 1
        else:
            count += 1
    if count > 0 and count <= 2:
        return "VALID"
    else:
        return "INVALID"

if __name__ == "__main__":
    while True:
        password = input("Enter password: ")
        if password == "exit":
            break
        print(check_password(password))