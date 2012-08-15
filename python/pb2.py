#!/usr/bin/python
a = 1
b = 2
sum = 2
while a < 4000000:
    temp = a + b
    a = b
    b = temp
    if temp%2 == 0:
        sum += temp
print sum
