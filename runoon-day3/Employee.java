import java.io.*;
public class Employee {
    //���ʵ������������ɼ�
    public String name;

    //˽�б��������ڸ���ɼ�
    private double salary;

    //�������ж�name��ֵ
    public Employee(String empName){
        name = empName;
    }
    //�趨salary��ֵ
    public void setSalary(double empSal){
        salary = empSal;
    }
    //��ӡ��Ϣ
    public void printEmp(){
        System.out.println("���֣�"+name);
        System.out.println("нˮ��"+salary);
    }

    public static void main(String[] args){
        Employee empOne = new Employee("Tomy");
        empOne.setSalary(5000.0);
        empOne.printEmp();
    } 
}
