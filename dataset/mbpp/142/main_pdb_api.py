def count_samepair(list1,list2,list3):
    result = sum(m == n == o for m, n, o in zip(list1,list2,list3))
    return result
count_samepair([1,2,3,4,5,6,7,8],[2,2,3,1,2,6,7,9],[2,1,3,1,2,6,7,9])