class prac1_2{
    
    public static void main(String[] args){

        int num = 96;
        int rev = 0;
        
        System.out.println("Original number is : "+num);
        while (num!=0){
            rev = rev*10 + num%10;
            num = num/10;
        }
        System.out.println("Reverse of the number is : "+rev);
    }
}