package metodusok;

import java.util.ArrayList;

public class list
{
    public static ArrayList make_lis(int num)
    {
        ArrayList list = new ArrayList();
        for (int x = 0; x < num; x++)
        {
            list.add(x);
        }
        return list;
    }
    
    public static void main(String[] args)
    {
        System.out.println(make_lis(45));
    }
}
