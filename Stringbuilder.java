import java.util.*;
class Stringbuilder{
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder("TONY");
        System.out.println(sb);
        
        //System.out.println(sb.CharAt(0));
        sb.setCharAt(0,'Y');
        System.out.println(sb);
    }
}
