class prac1_1{
    
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        
        System.out.println("Value of A : "+a);
        System.out.println("Value of B : "+b);

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("\nValue after swapping\n");
        
        System.out.println("Value of A : "+a);
        System.out.println("Value of B : "+b);
    }
}