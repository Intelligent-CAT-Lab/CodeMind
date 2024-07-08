from typing import *	##line:(1)
def all_prefixes(string: str) -> List[str]:	##line:(2)
    result = []	##line:(3)
	##line:(4)
    for i in range(len(string)):	##line:(5)
        result.append(string[:i+1])	##line:(6)
    return result	##line:(7)

all_prefixes('asdfgh') 