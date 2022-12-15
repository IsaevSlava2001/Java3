

public class BodyOfAnyTypeOfArray
{

    public static <E> void  sid  (String s, E [] arr)
    {

        E [] a = arr;
        AnyTypeOfArray <E> sid = new AnyTypeOfArray <E> ();
        sid.setArr(a);

        System.out.print(s + "  ");

        for(int i = 0; i< sid.getLength(); i++)
        {
            System.out.print(sid.getArrIndex(i)+" ");
        }

        System.out.println();
    }



    public static void main(String [] args)
    {

        String [] s = {"Hello", "World","!"};
        sid("String" , s);

        Integer [] intr = { 1,2,3,4,5,6,7,8};
        sid("Integer" , intr);

        Double [] ad = {1.2,1.5,6.7};
        sid("Double" , ad);

    }

}
