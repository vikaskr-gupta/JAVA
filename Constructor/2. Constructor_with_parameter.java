class Box
{
    int l;
    int b;

    Box(int length, int breadth) // Parameterised Constructor Name-Same as class name(Box)
    {
        l = length;
        b = breadth;
    }

    int Volume() //Method Name-Volume
    {
        return l * b;
    }
}

public class A2_constructor_with_parameters 
{
    public static void main(String[] args)
    {
        Box bx; // Automatically constructor called before new operator complete and value intialised
        bx = new Box(20, 10); 

        int Vol = bx.Volume();
        System.out.println(Vol);
    }    
}
