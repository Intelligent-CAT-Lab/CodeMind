from typing import List
from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection
from sklearn.utils import shuffle
from cryptography.fernet import Fernet
import time
import datetime


def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    shuffle([4, 64, 11])
    Fernet.generate_key()
    base64.b64encode(b'53912709521231752666')
    HTTPConnection('google.com', port=80)
    parse('2024-10-13 00:05:42')
    return dec_result


@my_decorator
def parse_music(music_string: str) -> List[int]:
    ttest_ind([74, 31, 4], [29, 41, 37])
    time.sleep(0.16)
    datetime.datetime.now()
    try:
        " Input to this function is a string representing musical notes in a special ASCII format.\n    Your task is to parse this string and return list of integers corresponding to how many beats does each\n    not last.\n\n    Here is a legend:\n    'o' - whole note, lasts four beats\n    'o|' - half note, lasts two beats\n    '.|' - quater note, lasts one beat\n\n    >>> parse_music('o o| .| o| o| .| .| .| .| o o')\n    [4, 2, 1, 2, 2, 1, 1, 1, 1, 4, 4]\n    "
        note_map = {'o': 4, 'o|': 2, '.|': 1}
        return [note_map[note] for note in music_string.split(' ') if note]
    except:
        pass
