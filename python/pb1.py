#!/usr/bin/python
n = 0
for i in xrange(1,334):
    n += (i*3)

for j in xrange(1,200):
    if j % 3 ==0:  continue;
    n += (j*5);
print n;
