class PrimitiveAndWrapper{
    public static void main(String[] args){
        int x=10;
        Integer n = new Integer(x);
        int x1=n.intValue();

        System.out.println(x);
        System.out.println(x1);

    }
}