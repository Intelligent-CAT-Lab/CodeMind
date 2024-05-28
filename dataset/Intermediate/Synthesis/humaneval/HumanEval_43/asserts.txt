

METADATA = {}


def check(candidate):
    assert candidate([1, 3, 5, 0]) == False
    assert candidate([1, 3, -2, 1]) == False
    assert candidate([1, 2, 3, 7]) == False
    assert candidate([2, 4, -5, 3, 5, 7]) == True
    assert candidate([1]) == False

    assert candidate([-3, 9, -1, 3, 2, 30]) == True
    assert candidate([-3, 9, -1, 3, 2, 31]) == True
    assert candidate([-3, 9, -1, 4, 2, 30]) == False
    assert candidate([-3, 9, -1, 4, 2, 31]) == False

