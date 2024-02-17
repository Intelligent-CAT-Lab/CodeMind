txt = "apple"

check = txt.split(' ')[-1]
print(True if len(check) == 1 and (97 <= ord(check.lower()) <= 122) else False)