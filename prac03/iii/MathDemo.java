class MathDemo {
    public int square(int num){
        return num*num;
    }    
    public int add(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        MathDemo math = new MathDemo();
        System.out.println("Squaure of 8 is : "+math.square(8));
        System.out.println("54+15 = "+math.add(54,15));
    } 
}