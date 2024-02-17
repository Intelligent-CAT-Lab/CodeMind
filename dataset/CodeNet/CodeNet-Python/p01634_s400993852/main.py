import re
lst = input()
if len(lst) >= 6:
    if re.findall("[0-9]",lst):
        if re.findall("[A-Z]",lst):
            if re.findall("[a-z]",lst):
                print("VALID")
            else: print("INVALID")
        else: print("INVALID")
    else: print("INVALID")
else: print("INVALID")
