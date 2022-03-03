package metodusok;

import java.util.Locale;
import java.util.Scanner;

public class BMI
{
    public static void cim(String text)
    {
        System.out.println(text);
    }
    
    public static int beker(String text, int min, int max)
    {
        Scanner sc = new Scanner(System.in);
        int num = -5;
        while (num>max || num<min)
        {
            System.out.printf("%s [%s - %s]: ", text, min, max);
            num = sc.nextInt();
            if(num>max || num<min)
                System.out.println("Rossz érték!");
        }
        return num;
    }
    
    public static double bmiszam(int mag, int suly)
    {
        return suly/Math.pow((mag*1.0)/100, 2);
    }
    
    public static void ertekeles(int mag, int suly, double bmi)
    {
        System.out.printf("Ön %s cm magas és %s kg tömegű ", mag, suly);
        System.out.printf(Locale.ENGLISH, "így BMI indexe %.1f\n", bmi);
        String result = "";
        if(bmi>0)
            result = "túlsúlyos";
        else
            result = "vékony";
        System.out.printf("Tehát ön %s testalkatú.\n", result);
    }
    
    public static void main(String[] args)
    {
        cim("BMI index kiszámítása");
        int mag = beker("Testmagasság (cm)", 100, 200);
        int suly = beker("Testtömeg (kg)", 40, 150);
        double bmi = bmiszam(mag, suly);
        ertekeles(mag, suly, bmi);
    }
}
