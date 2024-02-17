temp = 1
timeLimit = 1234567890
s = timeLimit // temp
e = timeLimit % temp
print([f'{e} oC', f'{s} {e}'][s > 1])