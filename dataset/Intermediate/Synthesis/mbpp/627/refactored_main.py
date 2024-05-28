array = [0,1,2,3]
start = 0
end = None
if end is None:
    end = len(array) - 1
while(True):
    if(start > end):
        print(end + 1)
        break
    if(start != array[start]):
        print(start)
        break
    mid = int((start + end) / 2)
    if(array[mid] == mid):
        start = mid + 1
    else:
        end = mid