public class Recursion{
    public static void PrintNumb(int n){
        if(n==0)
        return;
        
        System.out.println(n);
        PrintNumb(n-1);
    }
    public static void main(String args[]){
        int n=6;
        PrintNumb(n);
    }
}
