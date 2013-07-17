#!/usr/bin/python

# Triangle: n(n+1)/2
# Pantagonal: n(3n-1)/2
# Hexagonal: n(2n-1)
import math

def isTriangle(num):
    """if t = n(n+1)/2;
    then n=(-1+sqrt(1+8t))/2;
    so sqrt(1+8t) mod 2 = 1"""
    return math.sqrt(1+8*num) % 2==1

def isPantagonal(n):
    """n(3n-1)/2=t
    so 3n^2-n-2t=0
    n=(1+sqrt(1+24t))/6
    so sqrt(1+24t) mod 6 equals 5
    then t is a pantagonal"""
    return math.sqrt(1+24*n) %6 ==5

for i in range(144, 200000):
    t = i*(2*i-1)
    if isTriangle(t) and isPantagonal(t):
        print t,i
        break



