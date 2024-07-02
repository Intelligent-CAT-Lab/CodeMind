def test_duplicate(arraynums):
    nums_set = set(arraynums)    
    return len(arraynums) != len(nums_set)     
test_duplicate(([1,2,3,4,5]))