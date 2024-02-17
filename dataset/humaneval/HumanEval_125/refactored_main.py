txt = "Hello world!"
if " " in txt:
    result = txt.split()
elif "," in txt:
    result = txt.replace(',',' ').split()
else:
    result = len([i for i in txt if i.islower() and ord(i)%2 == 0])
print(result)