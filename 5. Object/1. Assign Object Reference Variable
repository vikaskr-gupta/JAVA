class Box
{
    int x = 10;
}

public class A1_Assign_obg_reference_var 
{
    public static void main(String[] args) 
    {
        // create instance
        Box D1 = new Box();
        System.out.println("D1 = "+D1.x); // Print 10
        // System.out.println("G1 = "+G1.x);  At this time G1 can't define so it gives error!

        Box G1 = D1;  // Point to same reference
        System.out.println("G1 = "+G1.x); // Print 25
        // Assigning an obj to another obj 

        // updating the value of x using G!
        // reference variable
        G1.x = 25;

        System.out.println("G1 = "+G1.x); // Print 25
        System.out.println("D1 = "+D1.x); // Print 25
        D1 = null;
        System.out.println("G1 = "+G1.x); // Print 25
        // System.out.println("D1 = "+D1.x); // NULL
    }
}
