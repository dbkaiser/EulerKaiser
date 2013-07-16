#!/usr/bin/python

trilist=[];

def countTriangles():
    """store all the triangle numbers and store in a map"""
    global trilist
    trilist=[0]*2601
    for i in range(1, 75):
        x=i*(i+1)/2
        if(x>2600): break
        trilist[x]=1

def countSum(word):
    """count the sum of single char's number into a sum"""
    sum=0
    for c in word:
        sum+=(ord(c)-ord('A')+1)
    return sum

def checkTriangle(num):
    global trilist
    return trilist[num]==1
    
countTriangles()
print countSum("ASDI")
fileint=file("../words42.txt",'r');
content=fileint.read()
purge=content.replace('"','')
lists=purge.split(',')
sum=0
for li in lists:
    sisum=countSum(li)
    if checkTriangle(sisum):
        sum+=1

print sum


