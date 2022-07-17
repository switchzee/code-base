# multi-dimensional slice
import numpy as np
ls = list(range(5))
mls = [[1]]
mat = np.array(list(range(100))) # 1d numpy array
mat.shape = (10,10) # make it 2d

# single slice
print(mat[2,2])
# 2d slice
print(mat[1, :])
# use ellipsis
print(mat[1,...])

# assign to slice
ls[2:5] = [20,30,40,50]
# del a slice
del ls[5:7]

# * in slice
nls = ls*2 # immutable object
nls[1] = 0 # only change nls[1]
nls = mls*2 # mutable object
nls[1].append(2)
print(nls) # change nls[0] too