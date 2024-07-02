def find_Element(arr,ranges,rotations,index) :  
    for i in range(rotations - 1,-1,-1 ) : 
        left = ranges[i][0] 
        right = ranges[i][1] 
        if (left <= index and right >= index) : 
            if (index == left) : 
                index = right 
            else : 
                index = index - 1 
    return arr[index] 
find_Element([1,2,3,4,5],[[0,2],[0,3]],2,1)