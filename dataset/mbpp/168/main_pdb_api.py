def frequency(a,x): 
    count = 0  
    for i in a: 
      if i == x: 
        count += 1

    return count 
frequency([1,2,3], 4)