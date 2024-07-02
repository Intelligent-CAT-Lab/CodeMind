def f(text, function):
    cites = [len(text[text.index(function) + len(function):])]
    for char in text:
        if char == function:
            cites.append(len(text[text.index(function) + len(function):]))
    return cites
f("010100", "010")