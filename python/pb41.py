#!/usr/bin/python

from itertools import permutations
import math

def listToDigit(lists):
    return int(''.join(str(u) for u in lists))


def isPrime(num):
    """ Judge if the num is prime"""
    if num==2 or num==3 : return True
    if num%2==0 or num%3==0 : return False
    root=int(math.ceil(math.sqrt(num+1)))
    print root
    for i in range(3,root+1, 2):
        if num%i==0 : return False
    return True

# it is surely that 1-8 digits will be divided by 3, and so do 1-9
lists=permutations(range(7,0,-1))

for num in lists:
    thedi=listToDigit(num)
    if isPrime(thedi): 
        print thedi
        print "auv"
        print num
        break

    
print "done"




