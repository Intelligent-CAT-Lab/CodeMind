<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python Code:

from collections import defaultdict , deque
from heapq import heappush , heappop
from bisect import bisect_left , bisect_right
import sys , random , itertools , math
sys . setrecursionlimit ( 10 ** 5 )
input = sys . stdin . readline
sqrt = math . sqrt
def LI ( ) : return list ( map ( int , input ( ) . split ( ) ) )
def LF ( ) : return list ( map ( float , input ( ) . split ( ) ) )
def LI_ ( ) : return list ( map ( lambda x : int ( x ) - 1 , input ( ) . split ( ) ) )
def II ( ) : return int ( input ( ) )
def IF ( ) : return float ( input ( ) )
def S ( ) : return input ( ) . rstrip ( )
def LS ( ) : return S ( ) . split ( )
def IR ( n ) : return [ II ( ) for _ in range ( n ) ]
def LIR ( n ) : return [ LI ( ) for _ in range ( n ) ]
def FR ( n ) : return [ IF ( ) for _ in range ( n ) ]
def LFR ( n ) : return [ LI ( ) for _ in range ( n ) ]
def LIR_ ( n ) : return [ LI_ ( ) for _ in range ( n ) ]
def SR ( n ) : return [ S ( ) for _ in range ( n ) ]
def LSR ( n ) : return [ LS ( ) for _ in range ( n ) ]
mod = 1000000007
inf = float ( " INF " )
def solve ( ) :
    n = II ( )
    ans = 0
    for i in range ( 1 , n + 1 ) :
        x = n // i
        ans += i * ( 1 + x ) * x // 2
    print ( ans )
    return
if __name__ == ' _ _ main _ _ ' :
    solve ( )



Translate the above python code to java.

java Code:

[/INST]

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Arrays;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.ThreadLocal;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;
import java.util.concurrent.locks.StampedLock;
import java.util.concurrent.locks.StampedLock.ReadLock;
import java.util.concurrent.locks.StampedLock.WriteLock;
import java.util.concurrent.locks.StampedLock.Stamp;
import java.util.concurrent.locks.StampedLock.StampedLockException;
import java.util.concurrent.locks.StampedLock.StampedLockReadException;
import java.util.concurrent.locks.StampedLock.StampedLockWriteException;
import java.util.concurrent.locks.StampedLock.StampedLockUpgradeException;
import java.util.concurrent.locks.StampedLock.StampedLockDowngradeException;
import java.util.concurrent.locks.StampedLock.StampedLockTryOptimisticReadException;
import java.util.concurrent.locks.StampedLock.StampedLockTryOptimisticWriteException;
import java.util.concurrent.locks.StampedLock.StampedLockTryPessimisticReadException;
import java.util.concurrent.locks.StampedLock.StampedLockTryPessimisticWriteException;
import java.util.concurrent.locks.StampedLock.StampedLockTryConvertToOptimisticReadException;
import java.util.concurrent.locks.StampedLock.StampedLockTryConvertToOptimisticWriteException;
import java.util.concurrent.locks.StampedLock.StampedLockTryConvertToPessimisticReadException;
import java.util.concurrent.locks.StampedLock.StampedLockTryConvertToPessimisticWriteException;
import java.util.concurrent.locks.StampedLock.StampedLockTryUnlockReadException;
import java.util.concurrent.locks.StampedLock.StampedLockTryUnlockWriteException;
import java.util.concurrent.locks.StampedLock.StampedLockTryUnlockException;
import java.util.concurrent.locks.StampedLock.StampedLockTryConvertToUpgradableReadException;
import java.util.concurrent.locks.StampedLock.StampedLockTryConvertToUpgradableWriteException;
import java.util.concurrent.locks.StampedLock.StampedLockTryConvertToDowngradableReadException;
import java.util.concurrent.locks.StampedLock.StampedLockTryConvertToDowngradableWriteException;
import java.util.concurrent.locks.StampedLock.StampedLockTryConvertToReadException;
import java.util.concurrent.locks.StampedLock.StampedLockTryConvertToWriteException;
import java.util.concurrent.locks.StampedLock.StampedLockTryConvertException;
import java.util.concurrent.locks.StampedLock.StampedLockTryUnlockReadException;
import java.util.concurrent.locks.StampedLock.StampedLockTryUnlockWriteException;
import java.util.concurrent.locks.StampedLock.StampedLockTryUnlockException;
import java.util.concurrent.locks.StampedLock.StampedLockTryConvertToUpgradableReadException;
import java.util.concurrent.locks.StampedLock.StampedLockTryConvertToUpgradableWriteException;
import java.util.concurrent.locks.StampedLock.StampedLockTryConvertToDowngradableReadException;
import java.util.concurrent.locks.StampedLock.StampedLockTryConvertToDowngradableWriteException;
import java.util.concurrent.locks.StampedLock.StampedLockTryConvertToReadException;
import java.util.concurrent.locks.StampedLock.StampedLockTryConvertToWriteException;
import java.util.concurrent.locks.StampedLock.StampedLockTryConvertException;
import java.util.concurrent.locks.StampedLock.StampedLockTryUnlockReadException;
import java.util.concurrent.locks.StampedLock.StampedLockTryUnlockWriteException;
import java.util.concurrent.locks.StampedLock.StampedLockTryUnlockException;
import java.util.concurrent.locks.StampedLock.StampedLockTryConvertToUpgradableReadException;
import
