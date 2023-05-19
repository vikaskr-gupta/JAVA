class Box
{
    double width;
    double height;
    double depth;
}

class A5_A_Simple_Class {
    public static void main(String[] args)
    {
        Box myBox = new Box();
        double Vol;
        myBox.width = 3;
        myBox.height = 5;
        myBox.depth = 2;
        Vol = myBox.width * myBox.height * myBox.depth;
        System.out.println(Vol);
    } 
}
