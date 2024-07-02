def sort_sublists(input_list):
    result = [sorted(x, key = lambda x:x[0]) for x in input_list] 
    return result

sort_sublists((["green", "orange"], ["black", "white"], ["white", "black", "orange"]))