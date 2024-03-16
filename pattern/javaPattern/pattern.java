import java.util.Scanner;

public class pattern {

    static void pattern1(int n){
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
              System.out.println();
        } 

    }
    static void pattern2(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for(int i=0;i<n;i++){
            for(int h=0;h<n-i;h++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            for(int u=0;u<n-i;u++){

                System.out.print(" ");
            }
            System.out.println();
        }
    } 

    static void pattern4(int n){
        int count=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        int count=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(count+" ");
                count+=2;
            }
            System.out.println();
        }

    }

    static void pattern6(int n){
        char ob='A';
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(ob);
                ob++;

            }
            System.out.println();
        }
    }
    static void pattern7(int n){
        for(int i=n;i>0;i--){
            for (int j=0;j<i;j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }

    static void pattern8(int n){
        for(int i=n;i>0;i--){
            for(int k=0;k<n-i;k++){
                System.out.print(" ");
            }
            for (int j=0;j<i;j++){
                System.out.print("*");

            }
            System.out.println();
        }

    }

    static void pattern9(int n){

        for(int i=0;i<n;i++){
            for(int h=0;h<n-i;h++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void pattern10(int n){
        for(int i=0;i<n;i++){
            if(i==0 || i==n-1 ){
                for (int k=0;k<n;k++){
                    System.out.print("*");
                }
            }
         
            else{
                for(int h=0;h<n;h++){
                    if(h==0 || h==n-1){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
             System.out.println();

         }
    }


    static void pattern11(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if((i+j)%2==0){
                    System.out.print("0");
                }
                else{
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }

    static void pattern12(int n){

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();

        }
    }
    static void pattern13(int n){
        int l=2*n;
        int c=1;
        for(int i=0;i<n;i++){
            for(int k=0;k<i;k++){
                System.out.print(c);
                c++;
            }
            for(int j=0;j<l-2*i;j++){
                System.out.print(" ");

            }
            for(int h=0;h<i;h++){
                c--;
                System.out.print(c);
                
            }
            System.out.println();
        }
    }


    static void pattern14(int n){
        for(int i=0;i<n;i++){
            char a='A';
            for(int j=0;j<i;j++){
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }

    static void pattern15(int n){
        for(int i=n;i>0;i--){
            char a='A';
            for(int j=0;j<i;j++){
                System.out.print(a);
                a++;
            }
            System.out.println();
        }
    }

    static void pattern16(int n){
         char a='A';
        for(int i=n;i>0;i--){
           
            for(int j=0;j<i;j++){
                System.out.print(a);
                
            }
            a++;
            System.out.println();
        
    }
}

    static void pattern17(int n){
         char a='A';
        for(int i=0;i<n;i++){
           
            for(int j=0;j<=i;j++){
                System.out.print(a+" ");
                
            }
          
            System.out.println();
      a++;   
    }
     
}

    static void pattern18(int n){
        for(int i=0;i<n;i++){
            char a='A';
            int breakpoint=(2*i+1)/2;
            for(int k=0;k<n-i-1;k++){
                System.out.print(" ");
            }

            for(int j=0;j<2*i+1;j++){
                if(j<breakpoint){
                    System.out.print(a);
                    a++;
                }
                else{
                    System.out.print(a);
                    a--;
                }
            }
            for(int k=0;k<n-i-1;k++){
                System.out.print(" ");
            }
            System.out.println();

        }
    }

    static void pattern19(int n){
        for(int i=0;i<n;i++){
            for(int k=0;k<n-i;k++){
                System.out.print("*");
            }
            for(int l=0;l<2*i+1;l++){
                System.out.print(" ");
            }
            for(int m=0;m<n-i;m++){
                System.out.print("*");
            }
            System.out.println();

        }

        for(int o=n;o>0;o--){
            for(int p=0;p<n-o;p++){
                System.out.print("*");
            }
            for(int q=0;q<2*o+1;q++){
                System.out.print(" ");
            }
            for(int r=0;r<n-o;r++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    static void pattern20(int n){
        for(int i=0;i<n;i++){
            for(int x=0;x<n-i;x++){
                System.out.print(" ");
            }
            for(int k=0;k<2*i+1;k++){
                if(i==0  || k==0 || k==2*i){
                System.out.print("*");    
                }
                else{
                    System.out.print(" ");
                }
           
            }
            
            for(int x=0;x<n-i;x++){
                System.out.print(" ");
            }
            System.out.println();
        }
            for(int i=n-1;i>=0;i--){
            for(int x=0;x<n-i;x++){
                System.out.print(" ");
            }
            for(int k=0;k<2*i+1;k++){
                if(i==0  || k==0 || k==2*i){
                System.out.print("*");    
                }
                else{
                    System.out.print(" ");
                }
           
            }
            
            for(int x=0;x<n-i;x++){
                System.out.print(" ");
            }
            System.out.println();
        }
        
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int k=sc.nextInt();
        pattern20(k);
    }
}
