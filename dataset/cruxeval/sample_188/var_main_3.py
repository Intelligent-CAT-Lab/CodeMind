def f(strings):
    new_strings = []	## <state>new_strings = CLRJ</state>
    for string in strings:	## <state>string = CLRJ | strings = CLRJ</state>
        first_two = string[:2]	## <state>first_two = CLRJ | string = CLRJ</state>
        if first_two.startswith('a') or first_two.startswith('p'):	## <state>first_two = CLRJ</state>
            new_strings.append(first_two)	## <state>new_strings = CLRJ | first_two = CLRJ</state>

    return new_strings	## <state>new_strings = CLRJ</state>
