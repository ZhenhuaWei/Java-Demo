// import java.io.*;
/*
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
*/

public class Employee{//����������ĸ��д
    //salary�Ǿ�̬��˽�б���
    //private ��˵���ܱ��̳�; 
    //static  ��˵�þ�̬��������ֱ��ͨ�����������ʣ�Ҳ����ʵ���������ͨ��������з��� 
    private static double salary;

    //DEPARTMENT��һ������
    public static final String DEPARTMENT="������Ա";//������Ҫȫ����д

    //�������������ೣ��
    static final String TITLE = "Manager";
    public void setSalay(double salary){
        System.out.println("start setSalay" + salary);
        Employee.salary = salary;//Ҳ����д�� this.salary = salary; ���ǲ���д��salay = salary; ��Ϊ����ʹ�õ��Ǿͽ�ԭ��
        System.out.println("end setSalay" + Employee.salary);
    }

    public static void printSalary(){//��������ĸ����д�����ӵĵ�������ĸҪ��д
        System.out.println("printSalary ʵ��н�ʣ�"+ Employee.salary);
    }

    public static void main(String[] args){
        salary = 10000;//������Ҫ��д
        System.out.println(DEPARTMENT+"���ʣ�"+ salary);

        System.out.println("===========");
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();

        employee1.setSalay(50000.0);

        System.out.println("employee 1=====:");
        employee1.printSalary();
        System.out.println("employee 2=====:");
        employee2.printSalary();


        Employee.salary = 30000;//����Ҫʵ�����ֱ࣬���޸�static��̬��������ֱ�ӿ���ʹ��
        System.out.println("��ְ��н��"+Employee.salary);
        Employee.printSalary();
    }

}