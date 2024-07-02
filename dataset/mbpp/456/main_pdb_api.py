def reverse_string_list(stringlist):
    result = [x[::-1] for x in stringlist]
    return result
reverse_string_list(['Red', 'Green', 'Blue', 'White', 'Black'])