text = "python"
text = text.strip()
if len(text) < 1:
    print(None)
else:
    if all(text[i] in "0123456789" for i in range(len(text))):
        print(True)
    elif (text[0] in "+-") and \
    all(text[i] in "0123456789" for i in range(1,len(text))):
        print(True)
    else:
        print(False)