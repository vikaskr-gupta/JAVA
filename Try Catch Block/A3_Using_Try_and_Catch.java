public class A3_Using_Try_and_Catch {
    public static void main(String[] args) {
        try {
            int d = 0;
            int a = 10 / d;
            System.out.println("This will not be printed" + a);
        } catch (Exception e) {
            System.out.println("Division by zero");
        }
        System.out.println("After catch statement");
    }
}
