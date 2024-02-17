string = "Vipra"
prefix = "via"
if string.startswith(prefix):
    string = string.removeprefix(prefix)
print(string)