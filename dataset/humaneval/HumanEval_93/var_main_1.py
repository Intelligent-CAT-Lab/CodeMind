def encode(message):
    vowels = "aeiouAEIOU"	## vowels = CLRJ
    vowels_replace = dict([(i, chr(ord(i) + 2)) for i in vowels])	## vowels_replace = CLRJ|i = CLRJ|vowels = CLRJ
    message = message.swapcase()	## message = CLRJ
    return ''.join([vowels_replace[i] if i in vowels else i for i in message])	## i = CLRJ|vowels = CLRJ|vowels_replace = CLRJ|message = CLRJ
