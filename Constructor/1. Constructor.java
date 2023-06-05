class Box
{
    int l;
    int b;

    Box() // Constructor Name-Same as class name(Box)
    {
        l = 10;
        b = 20;
    }

    int Volume() //Method Name-Volume
    {
        return l * b;
    }
}

public class A1_constructor 
{
    public static void main(String[] args)
    {
        Box bx; // Automatically constructor called before new operator complete and value intialised
        bx = new Box(); 

        int Vol = bx.Volume();
        System.out.println(Vol);
    }    
}
