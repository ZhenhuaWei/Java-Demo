public class DefaultValue {
    static boolean bool;
    static byte by;
    static char ch;
    static double d;
    static float f;
    static int i;
    static long l;
    static short sh;
    static String str;
 
    public void pupAge(){
        int age = 0;
        //int age; //�������ʼ�� ��ô��һ�� age = age+7;�ᱨ��variable number might not have been initialized
        age = age + 7;
        System.out.println("С����������: " + age);
     }

    public static void main(String[] args) {
        System.out.println("Bool :" + bool);
        System.out.println("Byte :" + by);
        System.out.println("Character:" + ch);
        System.out.println("Double :" + d);
        System.out.println("Float :" + f);
        System.out.println("Integer :" + i);
        System.out.println("Long :" + l);
        System.out.println("Short :" + sh);
        System.out.println("String :" + str);
    }
}
