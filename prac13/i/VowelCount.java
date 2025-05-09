import java.util.Scanner;
public class VowelCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        int vowelCount=0;
        System.out.print("Enter a string : ");
        input = scanner.nextLine();
        for(int i=0;i<input.length();i++){
            char c = input.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
                vowelCount++;
        }
        System.out.println("'"+input+"' string contains "+vowelCount+" vowels");
    }    
}
