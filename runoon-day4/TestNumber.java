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
    }
}