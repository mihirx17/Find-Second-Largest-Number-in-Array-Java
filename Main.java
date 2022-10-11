public class Main {
    public static int second_largest_number(int a[])

    {
        int max=a[0];
        int second_max=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(max<a[i])
            {
                second_max=max;
                max=a[i];
            } else if (second_max<a[i]) {
                {
                    second_max=a[i];
                }
                
            }
        }
        return second_max;
    }
    public static void main(String[] args) {
     int Ary[]={1,2,4,5,7};
        System.out.println( second_largest_number(Ary));


        System.out.println("Hello world!");
    }
}