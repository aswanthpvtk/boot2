import java.util.Scanner;

public class menu_program {

    public static void main(String[] args) {
        int n1,n2,n3;
        int op,largest,smallest;
        System.out.println("-----------------------------------");
        System.out.println("enter your option");
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Largest\n2.Smallest\n4.prime or note\n4.Even or note\n5.reverse\n6.Exit");
        op = sc.nextInt();

        switch(op)
        {
            case 1:
                System.out.println("Enter the first number:");
                n1 = sc.nextInt();
                System.out.println("Enter the second number:");
                n2 = sc.nextInt();
                System.out.println("Enter the third number:");
                n3 = sc.nextInt();
                largest = n3 > (n1 > n2 ? n1 : n2) ? n3 : ((n1 > n2) ? n1 : n2);
                System.out.println("The largest number is: "+largest);

            case 2:
                System.out.println("Enter the first number:");
                n1 = sc.nextInt();
                System.out.println("Enter the second number:");
                n2 = sc.nextInt();
                System.out.println("Enter the third number:");
                n3 = sc.nextInt();
                smallest = n3 < (n1 < n2 ? n1 : n2) ? n3 : ((n1 < n2) ? n1 : n2);
                System.out.println("The smallest number is: "+smallest);


            case 3:
                int i,m=0,flag=0;
                System.out.println("Enter the  number:");
                int c = sc.nextInt();

                m=c/2;
                if(c==0||c==1){
                    System.out.println(c+" is not prime number");
                }else{
                    for(i=2;i<=m;i++){
                        if(c%i==0){
                            System.out.println(c+" is not prime number");
                            flag=1;
                            break;
                        }
                    }
                    if(flag==0)  { System.out.println(c+" is prime number"); }
                }

        }




    }
}
