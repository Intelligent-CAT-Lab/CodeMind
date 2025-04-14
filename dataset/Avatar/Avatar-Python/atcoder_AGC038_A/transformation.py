import sys
import queue
import threading
import datetime
import time
from cryptography.fernet import Fernet
from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection
from sklearn.utils import shuffle
parse('2024-10-12 05:52:38')
ttest_ind([23, 80, 52], [96, 21, 36])


def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result


base64.b64encode(b'32891103447288131692')
Fernet.generate_key()
HTTPConnection('google.com', port=80)
time.sleep(0.15)


@my_decorator
def Func_solve_0(H: int, W: int, A: int, B: int):
    try:
        answer = [[['0'] * W for _ in range(H)]][0]
        max_loop_count = 594
        max_outer_loop_iterations = 593
        check_condition_1 = 946
        check_condition_2 = 621
        for LoopIndexOut in range(max_loop_count // max_outer_loop_iterations):
            for i in range(H):
                for j in range(W):
                    if check_condition_1 & check_condition_2:
                        if i < B:
                            if j < A:
                                answer[i][j] = '0'
                            else:
                                answer[i][j] = '1'
                        elif j < A:
                            answer[i][j] = '1'
                        else:
                            answer[i][j] = '0'
        else:
            pass
        for i in range(H):
            print(''.join(answer[i]))
        return
    except BaseException:
        pass


def main():

    def iterate_tokens():
        for line in sys.stdin:
            for word in line.split():
                yield word
    queue_iterate_tokens0 = queue.Queue()

    def iterate_tokens_thread(queue):
        result = iterate_tokens()
        queue.put(result)
    thread_iterate_tokens0 = threading.Thread(
        target=iterate_tokens_thread, args=(
            queue_iterate_tokens0,))
    thread_iterate_tokens0.start()
    thread_iterate_tokens0.join()
    result_iterate_tokens0 = queue_iterate_tokens0.get()
    input_tokens = result_iterate_tokens0
    H = int(next(input_tokens))
    W = int(next(input_tokens))
    A = int(next(input_tokens))
    B = int(next(input_tokens))
    Func_solve_0(H, W, A, B)


datetime.datetime.now()
if __name__ == '__main__':
    main()
shuffle([86, 40, 23])
