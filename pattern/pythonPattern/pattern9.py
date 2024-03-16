l=4
for i in range(l):
    for j in range(l-i):
        print(" ",end=" ")
    for k in range(2*i+1):
        print("* ",end="")
    print()
i=4
while i>=0:
    k=4
    while k>i:
        print(" ",end=" ")
        k-=1
    j=0
    while j<(2*i+1):
        print("*",end=" ")
        j+=1

    l=4
    while l>i:
        print(" ",end=" ")
        l-=1
    i-=1
    print()