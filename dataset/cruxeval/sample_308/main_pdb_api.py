def f(strings):
    occurances = {}
    for string in strings:
        if string not in occurances:
            occurances[string] = strings.count(string)
    return occurances
f(["La", "Q", "9", "La", "La"])