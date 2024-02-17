array = [1, 2, 1]
new_array = array.copy()
new_array = reversed(new_array)
print([x*x for x in new_array])