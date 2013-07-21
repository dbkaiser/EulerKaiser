#!/usr/bin/python

from itertools import permutations
import math

nums=[]
def calcprimes(bound):
    global nums
    nums=[0]*bound
    calbou=int(math.sqrt(bound))+1;
    for i in range(2, calbou):
        for j in range(2, int(bound/i)+1):
            if i*j>=bound : break
            nums[i*j]=1

def listToDigit(lists):
    return int(''.join(str(u) for u in lists))

def tolist(num):
    return [x for x in str(num)]
    
bound=10001
calcprimes(bound)
l1=[1,2,3,4]
l2=[4,3,2,1]
l3=sorted(l1)
l4=sorted(l2)
print l4
found=False
for i in range(1000,10000):
    list=tolist(i)
    if nums[i] ==1: continue
    for l in permutations(list):
        j=listToDigit(l)
        if j <= i: continue
        if nums[j] == 1: continue
        k=2*j-i
        if k > 9999: continue
        if nums[k] ==1: continue
        if sorted(list) == sorted(tolist(k)):
            print i,j,k
            break

print "done"
        
