ls = [1, 2, 3, '3', '4'] # mixed bag list
# sort in place
try:
    ls.sort()  # error
except Exception as e:
    print('[Error]',e)
ls.sort(key=int)  # perform function int on every ele
print(ls)
# produce sorted list
try:
    sorted(ls)  # error
except Exception as e:
    print('[Error]',e)
sorted(ls, key=int)
print(ls)