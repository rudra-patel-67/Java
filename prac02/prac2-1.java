class prac2_1{
    
    public static void main(String[] args){
        for(int i=1;i<=100;i++){
            if(i%2==0){
                System.out.print(i*i+"\t");
            }
            else{
                System.out.print(i*i*i+"\t");
            }
            if(i%10==0)  // JUST FOR FORMATTING
                System.out.println("\n");
        }
    }
}