public class Puppy{
    int puppyAge;
    public Puppy(String name){//构造方法没有返回值声明
        //这个构造器仅有一个参数：name
        System.out.println("dog name: " + name);
    }

    public void setAge(int age){
        puppyAge = age;
    }

    public int getAge(){
        System.out.println("小狗的年龄是："+ puppyAge);
        return puppyAge;
    }

    public static void main(String[] args){
        //下面的语句将创建一个Puppy对象
        Puppy myPuppy = new Puppy("tommy");
        myPuppy.setAge(2);
        myPuppy.getAge();

        System.out.println("变量值：" + myPuppy.puppyAge);
    }
}
