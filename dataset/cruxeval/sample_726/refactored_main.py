text = "jcle oq wsnibktxpiozyxmopqkfnrfjds"
ws = 0
for s in text:
    if s.isspace():
        ws += 1
print(ws, len(text))