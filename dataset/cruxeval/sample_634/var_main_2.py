def f(input_string):
    table = str.maketrans('aioe', 'ioua')	## table = []
    while 'a' in input_string or 'A' in input_string:	## input_string = []
        input_string = input_string.translate(table)
    return input_string	## input_string = []
