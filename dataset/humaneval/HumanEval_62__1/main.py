from typing import *


def derivative(xs: list):
    return [(i * x) for i, x in enumerate(xs)][1:]
