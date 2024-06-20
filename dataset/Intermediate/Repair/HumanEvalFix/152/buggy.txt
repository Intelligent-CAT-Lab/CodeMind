def compare(game,guess):
    return [abs(x-y)+abs(y-x) for x,y in zip(game,guess)]
