import java.util.*;
class program8{
    public static int fact(int n){
        if(n<=1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number: ");
        int n=sc.nextInt();
        int result=fact(n);
        System.out.print("factorial of "+ n + " number :"+result);
    }
}