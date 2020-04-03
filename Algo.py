#GCM of two numbers
#Eculid's Algortithm

def gcd(a,b);
    t = a
    a = b
    b = t % b
   return a
print(gcd(85,43))
