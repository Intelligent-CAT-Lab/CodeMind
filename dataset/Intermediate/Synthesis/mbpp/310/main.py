def string_to_tuple(str1):
    result = tuple(x for x in str1 if not x.isspace()) 
    return result