package metodusok;
public class Metodusok
{
    public static void valami_mas()
    {
        System.out.println("valami");
    }
    
    public static void valami()
    {
        valami_mas();
    }
    
    public static void main(String[] args)
    {
        valami();
    }
}
