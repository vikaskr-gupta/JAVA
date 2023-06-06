class Box
{
    int x;
    int square(int x)
    {
        return x * x;
    }
}

public class A3_Method_with_parameters {
    public static void main(String[] args)
    {
        Box sqr = new Box();
        System.out.println(sqr.square(5));
    }
}
