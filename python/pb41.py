#!/usr/bin/python

from itertools import permutations
import math
primes=[];

def storePrime(bound):
    """store all the primes"""
    primes=[0]*(bound)
    times=int(math.sqrt(bound))+1
    for i in range(2, times+1):
        q = int(bound / times)+1
        for j in range(2, q +1):
            if i*j >= bound: 
                continue;
            primes[i*j]=1;

    return primes

def listToDigit(lists):
    return int(''.join(str(u) for u in lists))


def isPrime(num):
    """ Judge if the num is prime"""
    if num==2 or num==3 : return True
    if num%2==0 or num%3==0 : return False
    root=int(math.ceil(math.sqrt(num+1)))
    print root
    for i in range(3,root+1, 2):
        print i,"wehi"
        if num%i==0 : return False
    return True

lists=permutations(range(9,0,-1))
for num in lists:
    thedi=listToDigit(num)
    if isPrime(thedi): 
        print thedi
        print "auv"
        print num
        break

    




