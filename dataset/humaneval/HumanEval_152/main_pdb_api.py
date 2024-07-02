from typing import *
def compare(game,guess):
    return [abs(x-y) for x,y in zip(game,guess)]

compare([1,2,3,4,5,1],[1,2,3,4,2,-2])