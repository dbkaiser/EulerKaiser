#!/usr/bin/python

import math

def factorize(num):
    """return the set of factors"""
    s=set([])
    ori=num
    bound=int(math.sqrt(ori))+1
    while ori!=bound:
        change=False
        for i in range(2, bound+1):
            if ori%i == 0: 
                ori//=i
                s.add(i)
                bound=int(math.sqrt(ori))+1
                change=True
                break
            
        if change==False:
            s.add(ori)
            break
    return s

for i in range(700,1000000):
    if(len(factorize(i))==4):
        if len(factorize(i+1))==4 and len(factorize(i+2))==4 and len(factorize(i+3))==4:

            print i
            break
print "done"
