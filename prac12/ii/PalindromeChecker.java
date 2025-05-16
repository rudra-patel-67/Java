import java.util.Scanner;
public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String input = scanner.nextLine();
        try{
            checkPalindrome(input);
            System.out.println(input+" is a Palindrome string");
        }
        catch(StringNotPalindrome e){
            System.out.println("Exception occured : "+e.getMessage());
        }
    }   
    public static void checkPalindrome(String str) throws StringNotPalindrome{
        String reverse = new StringBuilder(str).reverse().toString();
        // System.out.println(reverse);
        if(!reverse.equals(str)){
            throw new StringNotPalindrome("Input string is not Palindrome");
        }
    } 
}
