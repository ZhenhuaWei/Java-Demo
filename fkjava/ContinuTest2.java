public class ContinuTest2
{
    public static void main(String[] args) {
        // 外层循环
        outer:
        for(int i=0; i<5; i++)
        {
            System.out.println("i的值是："+i);
            if(i == 3)
            {
                continue outer;
            }
        }
        System.out.println(" end ");
    }
}

//运行结果是 0 1 2 3 4
//说明这个标签，用在有两层循环才有用，一层的化其实和continue效果一样