def f(input_string):
    table = str.maketrans('aioe', 'ioua')	## <state>table = CLRJ</state>
    while 'a' in input_string or 'A' in input_string:	## <state>input_string = CLRJ</state>
        input_string = input_string.translate(table)
    return input_string	## <state>input_string = CLRJ</state>
