from collections import namedtuple
colors = ['black', 'white']
sizes = ['S', 'M', 'L']

# list comprehension
tshirts = [(color, size) for color in colors
           for size in sizes]
print('listcomp: ', tshirts)

# genexp with () omiited
tshirts = list((color, size) for color in colors for size in sizes)
print('genexp: ', tshirts)

# regular
tshirts = []
for color in colors:
    for size in sizes:
        tshirts.append((color, size))

print('regualr: ', tshirts)

# named tuple
# list of strs
Card = namedtuple('Card', ['rank', 'suit'])
# str divided by space
Card = namedtuple('Card', 'rank suit')
card = Card('7', 'diamonds')

print(card.rank, card.suit)