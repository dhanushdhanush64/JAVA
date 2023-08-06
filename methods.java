import java.util.*;
class Functions2{
    public static int CalculateSum(int a , int b){
        int sum= a+b;
        return sum;
        
    }
    
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter your inputs:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        int sum=CalculateSum(a,b);
        System.out.print("your ans is :");
        System.out.println(sum);
        
    }
}
