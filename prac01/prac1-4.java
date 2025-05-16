class prac1_4{
    public static boolean isArmstrongNum(int num){
        int digits = 0;
        int sum = 0;
        int temp = num;
        while(temp!=0){
            digits++;
            temp = temp/10;
        }
        temp = num;
        while(temp!=0){
            sum = sum + (int)Math.pow((temp%10),digits);
            temp = temp/10;
        }
        return sum==num;
    }
    public static void main(String[] args){
        int num = 371;
        int num1 = 31;
        if(isArmstrongNum(num)){
            System.out.println(num +" is an armstrong number");
        }
        else{
            System.out.println(num + " is not an armstrong number");
        }
        if(isArmstrongNum(num1)){
            System.out.println(num1 +" is an armstrong number");
        }
        else{
            System.out.println(num1 + " is not an armstrong number");
        }
    }
}