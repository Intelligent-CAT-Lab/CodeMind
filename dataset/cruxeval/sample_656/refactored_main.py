letters = ['b', 'i', 'r', 'o', 's', 'j', 'v', 'p']
a = [] 
for i in range(len(letters)):
    if letters[i] in a:
        print('no')
        break
    a.append(letters[i]) 
else:
    print('yes')