public class Puppy{
    int puppyAge;
    public Puppy(String name){//���췽��û�з���ֵ����
        //�������������һ��������name
        System.out.println("dog name: " + name);
    }

    public void setAge(int age){
        puppyAge = age;
    }

    public int getAge(){
        System.out.println("С���������ǣ�"+ puppyAge);
        return puppyAge;
    }

    public static void main(String[] args){
        //�������佫����һ��Puppy����
        Puppy myPuppy = new Puppy("tommy");
        myPuppy.setAge(2);
        myPuppy.getAge();

        System.out.println("����ֵ��" + myPuppy.puppyAge);
    }
}
