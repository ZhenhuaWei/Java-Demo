public class TestNumber{
    public static void main(String[] args)
    {
        //�� x ����Ϊ����ֵʱ������x��һ������
        //���Ա�����Ҫ��x����װ�䡣Ȼ��Ϊ��ʹx�ܽ��м����㣬����Ҫ��x���в��䡣
        System.out.println("Hello!!");
        Integer x = 5;
        x = x+10;
        System.out.println(x);

        // Math��
        System.out.println("90�� ������ֵ��" + Math.sin(Math.PI/2));
        System.out.println("0�ȵ�����ֵ��"+ Math.cos(0));
        System.out.println("60�ȵ�����ֵ��"+Math.tan(Math.PI/3));
        System.out.println("1��������ֵ��"+Math.atan(1));
        System.out.println("PI/2�ĽǶ�ֵ"+Math.toDegrees(Math.PI/2));
        System.out.println(Math.PI);

        double[] nums = {1.4, 1.5, 1.6, -1.4, -1.5, -1.6};
        for(double num: nums){
            test(num);
        }
    }

    //��һ��main�������� ʵ�ַ��������������ĵ��÷�ʽ��c���ԵĻ��ᱨ��
    public static void test(double num){
        System.out.println("Math.floor(" + num +")=" + Math.floor(num));
        System.out.println("Math.round(" + num +")=" + Math.round(num));
        System.out.println("Math.ceil(" + num +")=" + Math.ceil(num));
        System.out.println();
    }
}