public class SimpleCalculator {

    static int op = 0;
    
    public static void add(int a, int b)
    {
        op++;
        int c=a+b;
        System.out.println(c);

    }
    public static void sub(int a, int b)
    {
        op++;
        int d=a-b;
        System.out.println(d);

    }
    
    public static void main(String[] arg)
    {
        add(2,3);
        sub(2,3);
    } 
}
