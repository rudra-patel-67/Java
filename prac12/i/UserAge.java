import java.util.Scanner;
public class UserAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = scanner.nextInt();
        try{
            if(age<18){
                throw new AgeException("Age should be greater than or equal to 18");
            }
            System.out.println("Your age = "+age);
        }
        catch(AgeException e){
            System.out.println("Exception caught : "+e.getMessage());
        }
    }
}
