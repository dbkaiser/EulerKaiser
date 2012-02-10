#!/usr/bin/python
# though this is useless

def readfile():
	f=file('../test.txt');
	while True:
		str = f.readline();
 		print ord(str[len(str)-1]);
		if len(str)==0 :
			break;

	f.close();

def isPrime(num):
	for x in range (1,num/2):
		if num%x==0: return False;
	return True;

print(isPrime(33))
