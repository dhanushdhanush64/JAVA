class Salary{
    int salary=20000;
    
}
class TotalSalary extends Salary{
    int hike=10000;
}
class YearlySalary extends TotalSalary{
    int yearlysalary=100000;
}
public class MultilevelInheritance{
    public static void main(String args[]){
        YearlySalary t1=new YearlySalary();
        t1.hike=10000;
        System.out.println(t1.salary);
        System.out.println(t1.hike);
        System.out.println(t1.hike+t1.salary);
        System.out.println(t1.yearlysalary+t1.hike+t1.salary);
    }
}
//20000
//10000
//30000
//130000
