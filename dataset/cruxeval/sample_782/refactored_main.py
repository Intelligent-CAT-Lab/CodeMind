input = "a j c n x X k"
for char in input:
    if char.isupper():
        print(False)
        break
else:
    print(True)