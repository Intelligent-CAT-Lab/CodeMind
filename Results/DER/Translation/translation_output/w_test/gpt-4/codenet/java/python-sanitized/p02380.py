import math

def run():
    # Using input() to receive the input and split() method to parse inputs separated by space
    inputs = input().split()
    a, b, cc = map(float, inputs)  # Extract the values and convert them to floats
    
    # Convert degree to radians
    cc = math.radians(cc)

    # Calculate area of the triangle (s), sum of sides (l), and height (h)
    s = a * b * math.sin(cc) / 2.0
    l = a + b + math.sqrt(a**2 + b**2 - 2.0 * a * b * math.cos(cc))
    h = b * math.sin(cc)

    # Print the results with 8 decimal places
    print(f"{s:.8f}")
    print(f"{l:.8f}")
    print(f"{h:.8f}")

# Calling the function if the script is executed
if __name__ == "__main__":
    run()