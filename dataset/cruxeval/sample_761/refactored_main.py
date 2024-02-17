array = []
output = array.copy()
output[0::2] = output[-1::-2]
output.reverse()
print(output)