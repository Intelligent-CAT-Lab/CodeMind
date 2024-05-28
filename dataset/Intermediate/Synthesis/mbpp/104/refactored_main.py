input_list = (["green", "orange"], ["black", "white"], ["white", "black", "orange"])
result = [sorted(x, key = lambda x:x[0]) for x in input_list] 
print(result)