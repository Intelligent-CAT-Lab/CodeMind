def f(text):
    text = text.replace('#', '1').replace('$', '5')	## text = []
    return 'yes' if text.isnumeric() else 'no'	## text = []
