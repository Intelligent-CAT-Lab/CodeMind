text = "010100"
function = "010"
cites = [len(text[text.index(function) + len(function):])]
for char in text:
    if char == function:
        cites.append(len(text[text.index(function) + len(function):]))
print(cites)