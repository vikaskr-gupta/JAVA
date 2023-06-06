// METHOD WITH MULTIPLE PARAMETERS

class Box
{
    int width;
    int height;
    int length;

    void set_Dimentions(int w, int h, int l)
    {
        width = w;
        height = h;
        length = l;
    }

    int Volume()
    {
        return width * height* length;
    }
}
public class A4_Method_with_parameters_1 {
    public static void main(String[] args)
    {
        Box b1 = new Box();
        Box b2 = new Box();

        b1.set_Dimentions(2, 3, 4);
        b2.set_Dimentions(4, 5, 6);

        int vol = b1.Volume();
        System.out.println(vol);

        vol = b2.Volume();
        System.out.println(vol);
    }
}
