import java.util.*;
class Methodoverloading{
    static int mynum(int x,int y){
        return x*y;
        
    }
    static float myflt(float x,float y){
        return x+y;
       
    }
    public static void main(String args[]){
        System.out.println(mynum(4,6));
        System.out.println(myflt(0.6f,0.7f));
        
    }
}
