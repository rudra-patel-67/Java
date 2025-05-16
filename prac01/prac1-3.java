class prac1_3{
    
    public static void main(String[] args){
        int num = 0;
        int next = 1;
        System.out.println("Fibonacci Series : ");
        while(num<=100){
            System.out.print(num+" "+next+" ");
            num = num+next;
            next = num+next; 
        }
    }
}