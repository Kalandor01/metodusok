package metodusok;

import java.util.ArrayList;
import java.util.Random;

public class list
{
    public static int [] make_lis(int num)
    {
        int[] list = new int[num];
        for (int x = 0; x < num; x++)
        {
            list[x] = new Random.nextInt();
        }
        return list;
    }
    
    public static void main(String[] args)
    {
        System.out.println(make_lis(45));
    }
}
