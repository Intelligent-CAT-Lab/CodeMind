from typing import List


def filter_by_substring(strings: List[str], substring: str) -> List[str]:
    return [x for x in strings if x in substring]
