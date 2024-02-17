str = "try."
n = 5
if len(str) < n:
    print(str)
else:
    print(str.removeprefix(str[:n]))