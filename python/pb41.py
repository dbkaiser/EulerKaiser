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
    count=0;
    for i in lists:
        count = count * 10 + i;
    return count;







