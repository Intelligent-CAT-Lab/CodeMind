game = [1,2,3,4,5,1]
guess = [1,2,3,4,2,-2]
print([abs(x-y) for x,y in zip(game,guess)])