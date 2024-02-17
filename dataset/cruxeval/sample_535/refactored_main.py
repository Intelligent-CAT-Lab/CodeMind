n = 1341240312
for n in str(n):
    if n not in "012" and n not in list(range(5, 10)):
        print(False)
        break
else:
    print(True)