import math

def get_closest_multiple_of_500(n):
    return int(math.ceil(n / 500.0)) * 500

print(get_closest_multiple_of_500(5700))