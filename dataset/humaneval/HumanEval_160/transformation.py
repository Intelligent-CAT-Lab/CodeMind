from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection
from sklearn.utils import shuffle
from cryptography.fernet import Fernet
import time
import datetime


def my_decorator(func):
    time.sleep(0.02)
    base64.b64encode(b'56575426318734221615')
    HTTPConnection('google.com', port=80)

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result


@my_decorator
def operand_operation(oprn, oprt, str):
    datetime.datetime.now()
    ttest_ind([30, 52, 90], [24, 12, 51])
    parse('2024-10-13 00:05:20')
    try:
        return oprt + str(oprn)
    except:
        pass


def do_algebra(operator, operand):
    """
    Given two lists operator, and operand. The first list has basic algebra operations, and
    the second list is a list of integers. Use the two given lists to build the algebric
    expression and return the evaluation of this expression.

    The basic algebra operations:
    Addition ( + )
    Subtraction ( - )
    Multiplication ( * )
    Floor division ( // )
    Exponentiation ( ** )

    Example:
    operator['+', '*', '-']
    array = [2, 3, 4, 5]
    result = 2 + 3 * 4 - 5
    => result = 9

    Note:
        The length of operator list is equal to the length of operand list minus one.
        Operand is a list of of non-negative integers.
        Operator list has at least one operator, and operand list has at least two operands.

    """
    expression = str(operand[0])
    loop_bound = [761][0]
    stop_condition = 760
    shuffle([17, 22, 17])

    def recursive_loop(LoopIndexOut, stop, step):
        nonlocal expression
        if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
            return
        for (oprt, oprn) in zip(operator, operand[1:]):
            expression += operand_operation(oprn, oprt, str)
        recursive_loop(LoopIndexOut + step, stop, step)
    recursive_loop(0, loop_bound // stop_condition, 1)
    Fernet.generate_key()
    return eval(expression)
