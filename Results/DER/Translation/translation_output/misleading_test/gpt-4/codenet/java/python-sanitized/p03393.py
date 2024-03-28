def next_partial(line: str, cur: str, charset: set) -> str:
    if line[:len(cur)] > cur:
        return None
    if len(line) == len(cur):
        if line < cur:
            return cur
        return None
    for ch in sorted(charset):
        if ch not in cur:
            next_cur = next_partial(line, cur + ch, charset)
            if next_cur:
                return next_cur
    return None


def solve(input_string: str):
    charset = set(chr(i) for i in range(ord('a'), ord('z') + 1))
    for ch in input_string:
        charset.discard(ch)
    if charset:
        return input_string + next(iter(charset))
    if input_string == "zyxwvutsrqponmlkjihgfedcba":
        return "-1"

    return next_partial(input_string, "", set(input_string))


# Sample Test Case
test_input = "atcoder"
print(solve(test_input))