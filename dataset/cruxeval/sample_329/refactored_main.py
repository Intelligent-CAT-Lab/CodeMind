text = 'jh54kkk6'
for i in range(len(text)):
    if text[i] == text[i].upper() and text[i-1].islower():
        temp_var = True
        break
else:
    temp_var = False
print(temp_var)