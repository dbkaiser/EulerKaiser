#!/usr/bin/python

from itertools import permutations

def checkValid(numlist):
    """check the validity of a number as described: """
    if listToDigit(numlist[1:4])%2!=0: return False
    if listToDigit(numlist[2:5])%3!=0: return False
    if listToDigit(numlist[3:6])%5!=0: return False
    if listToDigit(numlist[4:7])%7!=0: return False
    if listToDigit(numlist[5:8])%11!=0: return False
    if listToDigit(numlist[6:9])%13!=0: return False
    if listToDigit(numlist[7:10])%17!=0: return False
    return True

def listToDigit(list):
    return int(''.join(str(u) for u in list))

lists=permutations(range(0,10))
sum=0
for i in lists:
    if checkValid(i):
        sum+=listToDigit(i)
print sum
