text = '-----\t\n\tth\n-----'
length = len(text)
index = 0
while index < length and text[index].isspace():
    index += 1
print(text[index:index+5])