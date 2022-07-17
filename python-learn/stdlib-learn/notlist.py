# array
from array import array
from random import randint, random
# create array by genexp
ints = array('i', (randint(1, 10) for i in range(10)))
floats = array('d', (random() for i in range(10)))
chars = array('b', (randint(-128,127) for i in range(10)))
uchars = array('B', (randint(0,256) for i in range(10)))
shorts = array('h', (randint(-128,127) for i in range(10)))

# memory views
memv = memoryview(shorts)
len(memv)
memv_B = memv.cast('B')
print(memv_B.tolist())
memv_B[5] = 4 # change shorts
print(shorts) 

# deques and queues
from collections import deque
import heapq
from queue import Queue
# build a deque from genexp
dq = deque(range(10), maxlen=10)