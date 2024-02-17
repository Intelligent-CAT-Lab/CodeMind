text = "Ibaskdjgblw asdl "
x = "djgblw"
while not (text.removeprefix(x) == text):
    text = text[1:]
print(text)