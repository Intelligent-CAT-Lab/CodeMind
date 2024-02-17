string = '--4/0-209'
while string:
    if string[-1].isalpha():
        print(string)
        break
    string = string[:-1]
else:
    print(string)