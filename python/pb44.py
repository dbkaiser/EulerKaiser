#!/usr/bin/python

# pantagonal z'5=x'5-y'5
# and t'5=x'5+y'5
# z'5=z(3z-1)/2
# so. z=(1+sqrt(1+12(3x^2-x-3y^2+y)))/6
# so. t=(1+sqrt(1+12(3x^2-x+3y^2-y)))/6
# calculate z from 1 to most
# and ((6z-1)^2-1)/12=3x^2-x-3y^2+y
# let m=x+y n=x-y and x=(m+n)/2 y=(m-n)/2
# so ((6z-1)^2-1)/12=3(m-1)n
# let ((6z-1)^2-1)/12=g
# t=(1+sqrt(1+12(g+6y^2-2y)))/6
# all above lead to a dead end orz...

import math


def pantagonal(n):
    return n*(3*n-1)/2

# n(3n-1)/2=t
# so 3n^2-n-2t=0
# n=(1+sqrt(1+24t))/6
# so sqrt(1+24t) mod 6 equals 5
# then t is a pantagonal
def isPantagonal(n):
    tem=math.sqrt(1+24*n)
    if tem != int(tem): return False
    if tem %6 == 5: return True
    return False

# algorithm:
# easy to prove:
# pan(5)-pan(4) < pan(5)-pan(3)
# pan(5)-pan(4) < pan(6)-pan(5)

def count():
    result =9999999
    for i in range(1,10000):
        x=pantagonal(i)
        if x-pantagonal(i-1) > result : 
            print x,y
            return result
        for j in range(i-1,1,-1):
            y=pantagonal(j)
            if isPantagonal(x-y) and isPantagonal(x+y) and x-y < result:
                result = x-y
                break
    print x,y
    return result

print count()
            
