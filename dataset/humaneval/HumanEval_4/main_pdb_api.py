from typing import *	##line:(1)
def mean_absolute_deviation(numbers: List[float]) -> float:	##line:(2)
    mean = sum(numbers) / len(numbers)	##line:(3)
    return sum(abs(x - mean) for x in numbers) / len(numbers)	##line:(4)

mean_absolute_deviation([1.0, 2.0, 3.0]) 