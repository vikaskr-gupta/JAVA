import java.util.Random;
public class A4_Handle_Exception_and_move_on {
    public static void main(String[] args)
    {
        Random r = new Random();
        int a = 0, b = 0, c = 0;
        for(int i = 0; i<10; i++)
        {
            try{
                b = r.nextInt();
                c = r.nextInt();
                a = 12345 / (b/c);
            } catch(Exception e){
                System.out.println("Division is Zero");
                a = 0;
            }
            System.out.println("a = " + a);
        }
    }
}
