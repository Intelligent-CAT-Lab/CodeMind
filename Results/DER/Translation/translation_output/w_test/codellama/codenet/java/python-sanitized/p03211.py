import math

def get_min_distance(string):
    min_distance = 1000
    for i in range(len(string) - 2):
        x = int(string[i:i+3])
        min_distance = min(min_distance, abs(x - 753))
    return min_distance

print(get_min_distance("1234567876"))