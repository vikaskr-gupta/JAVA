public class A5_Display_Exception {
    public static void main(String[] args) {
        try {
            int d = 0;
            int a = 10 / d;
            System.out.println("This will not be printed" + a);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
