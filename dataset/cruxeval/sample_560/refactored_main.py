text = "591237865"
x = 0
if text.islower():
    for c in text:
        if int(c) in list(range(90)):
            x+=1
print(x)