def count_distinct_characters(string: str) -> int:
    return len(set(string.lower()))

print(count_distinct_characters('abcde' + 'cade' + 'CADE'))