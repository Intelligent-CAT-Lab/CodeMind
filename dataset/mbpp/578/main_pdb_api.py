def interleave_lists(list1,list2,list3):
    result = [el for pair in zip(list1, list2, list3) for el in pair]
    return result
interleave_lists([1,2,3,4,5,6,7],[10,20,30,40,50,60,70],[100,200,300,400,500,600,700])