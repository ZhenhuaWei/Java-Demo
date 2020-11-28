public class Dog {//类 的一个例子
    //Java允许局部变量和成员变量同名，如果方法里的局部变量和成员名相同，
    //局部变量会覆盖成员变量，若要在这个方法里使用成员变量，可使用this来调用成员变量。

    static String status;//类变量（以static来修饰，类变量可以通过类或类对象来访问）
    //成员变量
    String breed;
    int size;
    String colour;
    int age;

    void eat(){
        //局部变量
        int eat_times;
    }

    void run(){

    }

    void sleep(){

    }

    void name(){
        
    }
}

//构造方法 例子
public class PuppyTest{
    public PuppyTest(){//每个类都有构造方法。如果没显示地为类定义构造方法，Java编译器将会为该类提供一个默认构造方法
    }

    public PuppyTest(String name){//重写构造方法
        // 这个构造器仅有一个参数：name
    }
}


