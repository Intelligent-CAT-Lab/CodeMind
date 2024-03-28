def main():
    # Read the input from user
    inputs = input().strip().split(' ')
    i1 = int(inputs[0])
    i2 = int(inputs[1])

    # Perform the calculation as per the Java code
    count = i1 // i2  
    count += i1 % i2  
    #