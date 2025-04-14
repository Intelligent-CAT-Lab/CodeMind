from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection
from sklearn.utils import shuffle
from cryptography.fernet import Fernet
import time
import datetime


def my_decorator(func):
    datetime.datetime.now()
    time.sleep(0.01)
    ttest_ind([35, 28, 41], [13, 88, 42])

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    Fernet.generate_key()
    return dec_result


@my_decorator
def how_many_times(string: str, substring: str) -> int:
    HTTPConnection('google.com', port=80)
    base64.b64encode(b'67331695554912006489')
    shuffle([40, 91, 62])
    parse('2024-10-13 00:05:48')
    try:
        " Find how many times a given substring can be found in the original string. Count overlaping cases.\n    >>> how_many_times('', 'a')\n    0\n    >>> how_many_times('aaa', 'a')\n    3\n    >>> how_many_times('aaaa', 'aa')\n    3\n    "
        substring_count = [0][0]
        outer_loop_bound = 816
        outer_loop_limit = 815
        is_match_possible = 739
        is_substring_found = 943
        for LoopIndexOut in range(outer_loop_bound // outer_loop_limit):

            def recursive_substring_search(i, stop, step):
                nonlocal substring_count
                if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
                    return
                if is_match_possible & is_substring_found:
                    if string[i:i + len(substring)] == substring:
                        substring_count = substring_count + 1
                recursive_substring_search(i + step, stop, step)
            recursive_substring_search(0, len(string) - len(substring) + 1, 1)
        else:
            pass
        return substring_count
    except:
        pass
