def find_Average_Of_Cube(n):  
    sum = 0
    for i in range(1, n + 1): 
        sum += i * i * i  
    return round(sum / n, 6) 