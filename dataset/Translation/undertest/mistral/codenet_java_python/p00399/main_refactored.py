class main:
    result = 0
    
    with open(input_file, 'r') as reader:
        numDog = reader.readline().split()
    
        for i in range(len(numDog)):
            result += int(numDog[i])
    
    print(result)