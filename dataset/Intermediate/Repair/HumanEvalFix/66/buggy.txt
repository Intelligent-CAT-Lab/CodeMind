def digitSum(s):
    if s == "": return 0
    return sum(ord(char) if char.islower() else 0 for char in s)
