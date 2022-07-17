# string formatting
name = 'Bob'
age = 47
# 1. old school %, format: long string will not be readable
print('hello %s, you are %s' % (name, age))
print('hello {0}, you are {1}'.format(name,age))
# 2. f-string: readable even for long string
# generally speaking, f makes {...} a one line code block
print(f'hello {name}, you are {age}')