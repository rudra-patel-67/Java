class prac1_5{

    public static boolean isPrime(int num){

        if(num>1 && num%2!=0)
        {            
            if(num==2 || num==3){
                return true;
            }
    
            for(int i=3;i<Math.sqrt(num);i+=2){
                if(num%i==0)
                    return false;
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        int num = 29;
        int num1 = 8;
        if(isPrime(num)){
            System.out.println(num + " is prime");
        }
        else{
            System.out.println(num + " is not prime");
        }
        if(isPrime(num1)){
            System.out.println(num1 + " is prime");
        }
        else{
            System.out.println(num1 + " is not prime");
        }
    }
}