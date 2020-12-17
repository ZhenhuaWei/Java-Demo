public class TestNumberMath{
    public static void main(String[] args)
    {
        //当 x 被赋为整型值时，由于x是一个对象，
        //所以编译器要对x进行装箱。然后，为了使x能进行加运算，所以要对x进行拆箱。
        System.out.println("Hello!!");
        Integer x = 5;
        x = x+10;
        System.out.println(x);

        // Math类
        System.out.println("90度 的正弦值：" + Math.sin(Math.PI/2));
        System.out.println("0度的余弦值："+ Math.cos(0));
        System.out.println("60度的正切值："+Math.tan(Math.PI/3));
        System.out.println("1的正反切值："+Math.atan(1));
        System.out.println("PI/2的角度值"+Math.toDegrees(Math.PI/2));
        System.out.println(Math.PI);

        //定义一个数组的两种写法 定义的是静态数组，一旦定义初始化后，长度就固定， 
        //如果想使用变长的 请使用数组列表（ArrayList 也称为动态数组）或者使用向量Vector
        // double[] nums = {1.4, 1.5, 1.6, -1.4, -1.5, -1.6};
        double nums[] = {1.4, 1.5, 1.6, -1.4, -1.5, -1.6};
        //加强型for使用
        for(double num: nums){
            test(num);
        }

        System.out.println("num[0] = " + nums[0]);
        nums[0] = 100;
        System.out.println("num[0] = " + nums[0]);
    }

    //main函数在上 实现方法在下这这样的调用方式，c语言的化会报错
    public static void test(double num){
        System.out.println("Math.floor(" + num +")=" + Math.floor(num));
        System.out.println("Math.round(" + num +")=" + Math.round(num));
        System.out.println("Math.ceil(" + num +")=" + Math.ceil(num));
        System.out.println();
    }
}