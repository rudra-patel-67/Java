class prac2_2{
    
    public static void main(String[] args){
        int num = 4;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(((i+j)%2==0)?"1":"0");
            }
            System.out.println();
        }    
    }
}