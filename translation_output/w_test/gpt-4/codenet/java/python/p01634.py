Here's the Java code translated to Python:

```python
def check_password_validity(password):
    if len(password) < 6:
        return "INVALID"
    c1 = sum(1 for c in password if '0' <= c <= '9')
    c2 = sum(1 for c in password if 'A' <= c <= 'Z')
    c3 = sum(1 for c in password if c < '0' or '9' < c < 'A' or 'Z' < c)
    if c1 > 0 and c2 > 0 and c3 > 0:
        return "VALID"
    else:
        return "INVALID"

# Sample Test
print(check_password_validity("password"))

# You can uncomment these lines to allow input from the user:
# while True:
#     try:
#         line = input()
#         if not line:
#             break
#         print(check_password_validity(line))
#     except EOFError:
#         break
```

The `check_password_validity` function in Python performs the same checks as the Java version. Uncomment the lines at the bottom if you want to provide input in the same way as the Java program (e.g., entering data via the stdin). The code will stop running when an empty line or end-of-file (EOF) is reached. For now, a sample test is included where the function is called directly with the test input "password".
