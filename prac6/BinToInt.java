class BinToInt {
    public static void main(String[] args) {
        int bin = 110011;
        int digits = -1;
        int num = 0;
        int temp = bin;
        while(temp>0){
            temp = temp/10;
            digits++;
        }
        temp=bin;
        for(int i=0;i<=digits;i++){
            if(temp%10==1){
                num=num+(int)(Math.pow(2,i)); 
            }
            temp=temp/10;
        }
        System.err.println(bin+" in decimal is "+num);
    }    
}
