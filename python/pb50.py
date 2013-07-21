#!/usr/bin/python
import math
nums=[]
bound=1000000
def calcprimes(bound):
    global nums
    nums=[0]*bound
    calbou=int(math.sqrt(bound))+1;
    for i in range(2, calbou):
        for j in range(2, int(bound/i)+1):
            if i*j>=bound : break
            nums[i*j]=1

calcprimes(bound)
print "calcfinished"
longest=0
sum=0
begin=0
primelist=[]
for i in range(2,bound):
    if nums[i] == 0 : primelist.append(i)

for i in primelist:
    count=1
    csum=i
    cbegin=i
    for j in primelist:
        if j<=i: continue
        if csum+j>=bound: continue
        csum+=j
        count+=1
        if nums[csum]==0:
            if count > longest:
                sum=csum
                begin=cbegin
                longest=count

print longest,sum,begin
