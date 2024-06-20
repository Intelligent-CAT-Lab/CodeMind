def solution(lst):
    return sum([x for idx, x in enumerate(lst) if idx%2==1 and x%2==1])
