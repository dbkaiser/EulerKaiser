#!/usr/bin/python

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

test=100000
bound=test*2+1
calcprimes(bound)
for i in range(12,test):
    n=i*2+1
    if nums[n]==0 :continue
    sb=int(math.sqrt(n/2))+1
    found=True
    for j in range(1,sb):
        part=(j**2) *2

        if part>=n : break
        if nums[n-part] == 0: 
            found=False
            break
    if found: 
        print n
        break
print "done"

    
