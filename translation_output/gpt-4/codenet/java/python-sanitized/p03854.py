# No need to import a Scanner equivalent, as Python has built-in input functions.
S = input()  # Reads input from the user.
S = S.replace("eraser", "-")
S = S.replace("erase", "-")
S = S.replace("dreamer", "-")
S = S.replace("dream", "-")
S = S.replace("-", "")
if len(S) == 0:
    print("YES")
else:
    print("NO")

#