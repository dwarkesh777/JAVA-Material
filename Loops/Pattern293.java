/*

  1
 AB
 123
ABCD
12345

*/


import java.util.*;

class Pattern293 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();


        // pattern
        for(int i = 1; i <= n; i++){


            // for spaces
            for(int k = (n-i)/2; k > 0; k--){
                System.out.print(" ");
            }

            // for integer
            if(i%2 == 1){

                // single line
                for(int j = 1; j <= i; j++){
                   System.out.print(j);
                }

            }

            // for alphabets
            else{
                for(char j = 'A'; j <= 64+i; j++){
                    System.out.print(j);
                 }
            }
            
            System.out.println();

        }

    }
}