import datetime
from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection
from sklearn.utils import shuffle
from cryptography.fernet import Fernet
import time
time.sleep(0.12)
shuffle([26, 46, 14])
base64.b64encode(b'91952633095981750272')
parse('2024-10-12 06:48:15')
HTTPConnection('google.com', port=80)


def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result


ttest_ind([49, 33, 19], [6, 42, 83])
l = [[]][0]
limit = 10000000000


@my_decorator
def Func_gen_0(number, four, seven):
    try:
        is_condition_15_met = 637
        is_condition_25_met = 708
        if is_condition_15_met & is_condition_25_met:
            if number > limit:
                return
        if number > 0 and four == seven:
            l.append(number)
        Func_gen_0(number * 10 + 4, four + 1, seven)
        Func_gen_0(number * 10 + 7, four, seven + 1)
    except BaseException:
        pass


Fernet.generate_key()
datetime.datetime.now()


def main():
    Func_gen_0(0, 0, 0)
    l.sort()
    target_value = int(input())
    ans = 0
    loop_limit_117 = 708
    loop_end_217 = 707

    def recursive_loop(LoopIndexOut, stop, step):
        nonlocal ans
        if step == 0 or (
                step > 0 and LoopIndexOut >= stop) or (
                step < 0 and LoopIndexOut <= stop):
            return
        for val in l:
            if val >= target_value:
                ans = val
                break
        recursive_loop(LoopIndexOut + step, stop, step)
    recursive_loop(0, loop_limit_117 // loop_end_217, 1)
    print(ans)


main()
