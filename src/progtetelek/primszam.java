package progtetelek;

import java.util.Random;

public class primszam
{
    public static boolean is_prim(int num)
    {
        if(num<2)
            return false;
        else
        {
//            int x = 2;
//            while (x<=Math.sqrt(num) && num%x != 0)
//                x++;
//            return !(x<=Math.sqrt(num));
            int x;
            for(x=2;x<=Math.sqrt(num) && num%x != 0;x++) {}
            return !(x<=Math.sqrt(num));
        }
    }
    
    public static void kisorozat(int[] sorozat)
    {
        for (int x : sorozat)
            System.out.print(x + " ");
        System.out.println();
    }
    
    public static void main(String[] args)
    {
        int num = 13;
        System.out.println(num + (is_prim(num)?" ":" nem ") + "prím.");
        
        num = 10001;
        boolean prim = is_prim(num);
        int[] list = {10001, 2, 1, 10007, new Random().nextInt()};
        kisorozat(list);
        int prim_num = 0;
        for (int x : list)
        {
            if(is_prim(x))
                prim_num++;
        }
        System.out.println(prim_num + " prím van.");
        
        int x;
        for(x=0;x<list.length && !is_prim(list[x]);x++){}
        if(x<list.length)
        {
            for(x=0;x<list.length && !is_prim(list[x]);x++){}
            System.out.println(x+1 + ". elem a prím.");
        }
        else
            System.out.println("Nincs prím");
    }
}
