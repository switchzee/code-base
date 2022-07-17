# immutable list
coordinates = (33.9425, -118.408056)
try:
    coordinates[1] = 0  # Error
except Exception as e:
    print("[error]:", e)

# records

traveler_ids = [('USA', '31195855'), ('BRA', 'CE342567'), ('ESP', 'XDA205856')]
for passport in traveler_ids:
    # unpacking
    print('%s/%s' % passport)
# parallel assignment
a, b = 1, 2
a, b = b, a  # swap
# function argument
t = (3, 7)
quotient, remainder = divmod(*t)
# * grabs excessive items
a, b, *rest = range(5)
# nested unpacking
metro_areas = [
 ('Tokyo', 'JP', 36.933, (35.689722, 139.691667)), # 
 ('Delhi NCR', 'IN', 21.935, (28.613889, 77.208889)),
 ('Mexico City', 'MX', 20.142, (19.433333, -99.133333)),
 ('New York-Newark', 'US', 20.104, (40.808611, -74.020386)),
 ('Sao Paulo', 'BR', 19.649, (-23.547778, -46.635833)),
]
print('{:15} | {:^9} | {:^9}'.format('', 'lat.', 'long.'))
fmt = '{:15} | {:9.4f} | {:9.4f}'
for name, cc, pop, (latitude, longitude) in metro_areas: # nested unpacking
    if longitude <= 0: # 
        print(fmt.format(name, latitude, longitude))
# named tuples
