package com.bootcamp;

class ProductHirePeakElementBruteforce
{
    public static void main (String[] args) throws java.lang.Exception
    {
        int[] list = {2,14,26,58,100,120,142,163};
        System.out.println("Peak "+peak(list));
    }

    public static int peak(int[] list)
    {
        // loop to find the peak
        int max=list[0];
        for(int i=1;i<list.length;i++)
        {
            if(list[i]>max)
                max=list[i];
        }
        return max;
    }

}
