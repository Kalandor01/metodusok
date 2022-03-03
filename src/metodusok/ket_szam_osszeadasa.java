package metodusok;
public class ket_szam_osszeadasa
{

    public ket_szam_osszeadasa() {
    }
    public static int add(int a, int b)
    {
        return a+b;
    }
    
    public static void add_kiir(int a, int b)
    {
        System.out.printf("-----------\n%s + %s = %s\n",a, b, add(a, b));
    }
    
    public static void main(String[] args)
    {
        int num1 = 2, num2 = 5;
        int sum = add(num1, num2);
        add_kiir(num1, num2);
        int num3 = 5;
        add_kiir(sum, num3);
    }
}
