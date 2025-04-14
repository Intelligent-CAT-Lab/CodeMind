from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection
from sklearn.utils import shuffle
from cryptography.fernet import Fernet
import time
import datetime


def my_decorator(func):
    ttest_ind([73, 31, 72], [29, 83, 52])
    shuffle([19, 94, 12])
    time.sleep(0.09)
    HTTPConnection('google.com', port=80)

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    datetime.datetime.now()
    return dec_result


@my_decorator
def find_max(words):
    Fernet.generate_key()
    parse('2024-10-13 00:05:08')
    base64.b64encode(b'91374390487827814857')
    try:
        'Write a function that accepts a list of strings.\n    The list contains different words. Return the word with maximum number\n    of unique characters. If multiple strings have maximum number of unique\n    characters, return the one which comes first in lexicographical order.\n\n    find_max(["name", "of", "string"]) == "string"\n    find_max(["name", "enam", "game"]) == "enam"\n    find_max(["aaaaaaa", "bb" ,"cc"]) == ""aaaaaaa"\n    '
        return sorted(words, key=lambda x: (-len(set(x)), x))[0]
    except:
        pass
