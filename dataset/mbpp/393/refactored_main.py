input_list = [[0], [1, 3], [5, 7], [9, 11], [13, 15, 17]]
max_length = max(len(x) for x in input_list )   
max_list = max(input_list, key = lambda i: len(i))    
print(max_length, max_list)