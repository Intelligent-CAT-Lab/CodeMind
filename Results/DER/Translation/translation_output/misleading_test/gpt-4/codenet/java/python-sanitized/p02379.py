import math

def distance_between_points(input_str):
    # Split the input string to get the individual numbers
    lines = input_str.split()
    # Convert all string values to float and store them in the list
    points = list(map(float, lines))
    # Calculate and return the Euclidean distance
    return math.sqrt((points[0] - points[2])**2 + (points[1] - points[3])**2)

# Sample test case
input_test = '0 0 1 1'
print(distance_between_points(input_test))