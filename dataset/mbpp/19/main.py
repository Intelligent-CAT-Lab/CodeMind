def test_duplicate(arraynums):
    nums_set = set(arraynums)    
    return len(arraynums) != len(nums_set)     