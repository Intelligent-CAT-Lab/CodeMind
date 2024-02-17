a = "booty boot-boot bootclass"
split_on = 'k'
t = a.split()
a = []
for i in t:
    for j in i:
        a.append(j)
if split_on in a:
    print(True)
else:
    print(False)