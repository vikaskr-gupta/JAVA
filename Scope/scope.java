class A1_scope {
    public static void main(String[] args)
    {
        int x;
        x = 10;
        {
            int y = 11;
            System.out.println("X and Y is " + x + " and " + y);
        }
        System.out.println("X is " + x );
        // System.out.println("Y is " + y );.// Through an error 

    }
}
