text = 'upper case'
repl = 'lower case'
trans = str.maketrans(text.lower(), repl.lower())
print(text.translate(trans))