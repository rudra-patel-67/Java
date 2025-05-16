class Prac4 {
    public void display(){
        int n=1;
        while (n<=100){
            if(n%10==0)
                System.out.println();
            System.out.print(n++ + "\t");
        }
    }    

    public void fibonacci(){
        int num = 0;
        int next = 1;
        while (num<100) {
            System.out.print(num+"\t");
            int sum=num+next;
            num=next;
            next=sum;
        }
    }

    public static void main(String[] args) {
        Prac4 ps = new Prac4();
        System.out.println("Printing 1-100:");
        ps.display();
        System.out.println("\n");
        System.out.println("Fibonacci Sequence till 100:");
        ps.fibonacci();
    }
}