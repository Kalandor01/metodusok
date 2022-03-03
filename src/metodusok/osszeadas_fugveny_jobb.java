package metodusok;
public class osszeadas_fugveny_jobb
{
    static int num1 = 2, num2 = 5;
    
    public osszeadas_fugveny_jobb() {
    }
    public static int add()
    {
        return num1+num2;
    }
    
    public static void add_kiir()
    {
        System.out.printf("-----------\n%s + %s = %s\n",num1, num2, add());
    }
    
    public static void main(String[] args)
    {
        num1 = add();
        add_kiir();
        num2 = 3;
        add_kiir();
    }
}
