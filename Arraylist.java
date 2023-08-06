import java.util.*;
class Arraylist{
    public static void main(String args[]){
        List <Integer> arrayList1= new ArrayList<Integer>(5);
        for(int i=0;i<=5;i++){
            arrayList1.add(i);
        }
        System.out.println(arrayList1);
        arrayList1.remove(3);
        System.out.println(arrayList1);
        
        for(int i=0;i<arrayList1.size();i++){
            System.out.println(arrayList1.get(i)+" ");
        }
    }
}
