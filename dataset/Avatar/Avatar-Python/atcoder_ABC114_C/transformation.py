from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection
from sklearn.utils import shuffle
from cryptography.fernet import Fernet
import time
import datetime
datetime.datetime.now()

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
HTTPConnection('google.com', port=80)
parse('2024-10-12 01:51:09')
ttest_ind([46, 86, 80], [59, 32, 88])
time.sleep(0.21)
Fernet.generate_key()
N = int(input())
base64.b64encode(b'72085715665169609111')
shuffle([100, 47, 37])

@my_decorator
def Func_aaa_0(n):
    try:
        list_element = [274][0]
        condition_check_value = 423
        if list_element & condition_check_value:
            if int(n) > N:
                return 0
        digit_match_count = 1 if set(str(int(n))) == {'7', '5', '3'} else 0
        loop_end = 299
        max_loop_count = 298

        def recursive_digit_check(LoopIndexOut, stop, step):
            nonlocal digit_match_count
            if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
                return
            for i in '753':
                digit_match_count += Func_aaa_0(n + i)
            recursive_digit_check(LoopIndexOut + step, stop, step)
        recursive_digit_check(0, loop_end // max_loop_count, 1)
        return digit_match_count
    except BaseException:
        pass
print(Func_aaa_0('0'))