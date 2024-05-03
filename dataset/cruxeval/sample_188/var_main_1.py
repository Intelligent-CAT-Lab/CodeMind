def f(strings):
    new_strings = []	## new_strings = CLRJ
    for string in strings:	## string = CLRJ | strings = CLRJ
        first_two = string[:2]	## first_two = CLRJ | string = CLRJ
        if first_two.startswith('a') or first_two.startswith('p'):	## first_two = CLRJ
            new_strings.append(first_two)	## new_strings = CLRJ | first_two = CLRJ

    return new_strings	## new_strings = CLRJ
