def digitSum(s):
    if s == "": return 0	## s = CLRJ
    return sum(ord(char) if char.isupper() else 0 for char in s)	## char = CLRJ|s = CLRJ
