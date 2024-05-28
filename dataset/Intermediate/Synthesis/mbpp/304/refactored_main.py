arr = [1,2,3,4,5]
ranges = [[0,2],[0,3]]
rotations = 2
index = 1
for i in range(rotations - 1,-1,-1 ) : 
    left = ranges[i][0] 
    right = ranges[i][1] 
    if (left <= index and right >= index) : 
        if (index == left) : 
            index = right 
        else : 
            index = index - 1 
print(arr[index])