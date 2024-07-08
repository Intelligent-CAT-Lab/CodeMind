from typing import *	##line:(1)
def rescale_to_unit(numbers: List[float]) -> List[float]:	##line:(2)
    min_number = min(numbers)	##line:(3)
    max_number = max(numbers)	##line:(4)
    return [(x - min_number) / (max_number - min_number) for x in numbers]	##line:(5)

rescale_to_unit([2.0, 49.9]) 