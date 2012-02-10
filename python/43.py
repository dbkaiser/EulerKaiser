panlist=[];
numlist=[0,1,2,3,4,5,6,7,8,9];
#numlist=[1,2]
primelist=[2,3,5,7,11,13,17,19,23,29];
width = 3;
def countPan(num, numlist):
	for i in numlist: 
		numt=num*10+i;
		if(len(numlist)==1): 
			panlist.append(numt);
		else: 
			clonelist=[];
			for j in numlist:
				if(i!=j): clonelist.append(j)
			countPan(numt, clonelist);

def isRes(num):
	global width;
	str=num.tostring();
	for i in range(0,len(str)-width):
		if atoi(str[i:len(str)-1])%primelist[i]!=0: return false;



#countPan(0,numlist);
#print(panlist)
print isRes(1406357289)
