public class A6_Multiple_catch_block {
    public static void main(String[] args)
    {
        try{
            int a=10; // if a=0 then Exception is ArrayIndexOutOfBoundsException
            int b=76/a;
            int c[]= new int[5];
            c[6]=76;
        }
        catch(ArithmeticException e)
        {
        System.out.println("Exception: " + e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Exception: " + e);
        }
        System.out.println("Try and Catch Block End");
    }
}
