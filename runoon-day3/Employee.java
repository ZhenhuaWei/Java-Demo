import java.io.*;
/*
public class Employee {
    //这个实例变量对子类可见
    public String name;

    //私有变量，仅在该类可见
    private double salary;

    //构造器中对name赋值
    public Employee(String empName){
        name = empName;
    }
    //设定salary的值
    public void setSalary(double empSal){
        salary = empSal;
    }
    //打印信息
    public void printEmp(){
        System.out.println("名字："+name);
        System.out.println("薪水："+salary);
    }

    public static void main(String[] args){
        Employee empOne = new Employee("Tomy");
        empOne.setSalary(5000.0);
        empOne.printEmp();
    } 
}
*/

public class Employee{//类名称首字母大写
    //salary是静态的私有变量
    //private 是说不能被继承; 
    //static  是说该静态变量可以直接通过类名来访问，也可以实例化对象后通过对象进行访问 
    private static double salary;

    //DEPARTMENT是一个常量
    public static final String DEPARTMENT="开发人员";//常量需要全部大写

    public static void printSalary(){//方法首字母不大写，紧接的单词首字母要大写
        System.out.println("实际薪资："+ salary);
    }

    public static void main(String[] args){
        salary = 10000;//变量不要大写
        System.out.println(DEPARTMENT+"工资："+ salary);

        Employee.salary = 30000;//不需要实例化类，直接修改static静态变量，后直接可以使用
        System.out.println("升职加薪后："+Employee.salary);
        Employee.printSalary();
    }

}