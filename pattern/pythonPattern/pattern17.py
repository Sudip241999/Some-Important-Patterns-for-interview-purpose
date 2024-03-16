l=5
i=0
while i<l:
    p=65
    brkPt=(2*i+1)//2
    for j in range(0,(l-i-1),1):
        print(" ",end=" ")
    for k in range(0,(2*i+1),1):
        if k<brkPt:
            print(chr(p),end=" ")
            p=p+1
        else:
            print(chr(p),end=" ")
            p=p-1
        
    for o in range(0,(l-i-1),1):
        print(" ",end=" ")  
    print()  
    i+=1 
