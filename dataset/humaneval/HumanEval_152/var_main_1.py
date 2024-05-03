def compare(game,guess):
    return [abs(x-y) for x,y in zip(game,guess)]	## x = CLRJ|y = CLRJ|game = CLRJ|guess = CLRJ
