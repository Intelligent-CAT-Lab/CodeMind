def check_Consecutive(l): 
    return sorted(l) == list(range(min(l),max(l)+1)) 
check_Consecutive([1,2,3,4,5])