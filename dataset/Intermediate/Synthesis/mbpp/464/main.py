def check_value(dict, n):
    result = all(x == n for x in dict.values()) 
    return result