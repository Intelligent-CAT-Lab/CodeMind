def min_of_three(a,b,c): 
      if (a <= b) and (a <= c): 
        smallest = a 
      elif (b <= a) and (b <= c): 
        smallest = b 
      else: 
        smallest = c 
      return smallest 