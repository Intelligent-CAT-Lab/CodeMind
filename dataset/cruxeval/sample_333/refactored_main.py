places = [375, 564, 857, 90, 728, 92]
lazy = [728]
places.sort()
for _lazy in lazy:
    places.remove(_lazy)
if len(places) == 1:
    print(1)
for i, place in enumerate(places):
    if places.count(place+1) == 0:
        print(i+1)
print(i+1)