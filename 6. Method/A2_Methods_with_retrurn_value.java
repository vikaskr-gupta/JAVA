class Box
{
    int l;
    int b;

    int Volume()
    {
        return l * b;
    }
}

public class A2_Methods_with_retrurn_value {
    public static void main(String[] args)
    {
        Box bx = new Box();
        bx.l = 12;
        bx.b = 10;
        // int Vol = bx.Volume();
        // System.out.println(Vol);
        System.out.println(bx.Volume());
    }
}
