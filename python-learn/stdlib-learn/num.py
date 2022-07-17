import numpy as np
# build 1-d array
arr = np.arange(12) # natural order
arr = np.array(list(range(12))) # from list

# change shape
arr.shape = 3,4
print(arr)
# access a line
print(arr[2]) 
print(arr[2,:])
print(arr[:,1])
# access an ele
print(arr[2,3])

# save and load
from os import path
filepath = path.join('fluent_py', 'arr.npy')
np.save(filepath, arr)
arr = np.load(filepath)