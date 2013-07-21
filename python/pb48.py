#!/usr/bin/python

moding=10**10
sum=0
for i in range(1,1001):
    x=1
    for j in range(1,i+1):
       x*=i
       x=x%moding
    sum+=x

print sum
