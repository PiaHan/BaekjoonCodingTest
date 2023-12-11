import re

loc = input()
pattern = r'([a-zA-Z]+)(\d+)'
matches = re.match(pattern, loc)

width = matches.group(1)
height = matches.group(2)


m1w = 0
m1h = 0
m2w = 0
m2h = 0

#1. 수평으로 두칸 이동하고 수직으로 한칸.
if width == 'a' or width == 'b':
    m1w = 1
else:
    m1w = 2

if int(height) <2:
    m1h = 1
else:
    m1h = 2

#2. 수직으로 두 칸 이동하고 수평으로 한칸.
if width == 'a':
    m2w = 1
else:
    m2w = 2

if int(height) <3:
    m2h = 1
else:
    m2h = 2

answer = m1w*m1h + m2w*m2h
print(answer)
