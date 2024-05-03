def f(strings):
    new_strings = []	## new_strings = []
    for string in strings:	## string = [] | strings = []
        first_two = string[:2]	## first_two = [] | string = []
        if first_two.startswith('a') or first_two.startswith('p'):	## first_two = []
            new_strings.append(first_two)	## new_strings = [] | first_two = []

    return new_strings	## new_strings = []
