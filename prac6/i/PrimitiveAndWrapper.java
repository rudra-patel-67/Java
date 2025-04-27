class PrimitiveAndWrapper{
    public static void main(String[] args){
        String strNum= "25";
        Integer wrapInteger = new Integer(strNum) ;
        System.out.println("String : "+strNum);
        System.out.println("Wrapper: "+wrapInteger);
        
        int ip = Integer.parseInt(strNum);
        System.out.println("Primitive : "+ip);
    }
}