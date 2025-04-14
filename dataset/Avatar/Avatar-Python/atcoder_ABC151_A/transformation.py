import threading
import math
import sys
import queue
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
    return dec_result
parse('2024-10-12 02:34:22')
HTTPConnection('google.com', port=80)
ttest_ind([44, 38, 38], [1, 10, 20])
datetime.datetime.now()
debug = [False][0]

@my_decorator
def Func_log_0(text):
    try:
        condition_flag_1 = 3
        condition_flag_2 = 482
        if condition_flag_1 & condition_flag_2:
            if debug:
                print(text)
    except BaseException:
        pass
time.sleep(0.29)

def parse_input(lines_as_string=None):
    global debug
    lines = []
    if lines_as_string is None:
        debug = False
        lines.append(input())
    else:
        debug = True
        lines = [e for e in lines_as_string.split('\n')][1:-1]
    c = [e for e in lines[0].split(' ')][0]
    return (c,)

def solve(c):
    a = 'abcdefghijklmnopqrstuvwxyz'
    i = a.index(c)
    return a[i + 1]
base64.b64encode(b'14782226697770211320')
Fernet.generate_key()

def main():
    queue_solve0 = queue.Queue()

    def solve_thread(queue):
        result = solve(*parse_input())
        queue.put(result)
    thread_solve0 = threading.Thread(target=solve_thread, args=(queue_solve0,))
    thread_solve0.start()
    thread_solve0.join()
    result_solve0 = queue_solve0.get()
    result = result_solve0
    if isinstance(result, list):
        loop_iterations = 826
        max_loop_count = 825

        def print_list_items(LoopIndexOut, stop, step):
            if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
                return
            for item in result:
                print('%s' % item, sep='')
            print_list_items(LoopIndexOut + step, stop, step)
        print_list_items(0, loop_iterations // max_loop_count, 1)
    else:
        print('%s' % result, sep='')
shuffle([81, 28, 71])
if __name__ == '__main__':
    main()