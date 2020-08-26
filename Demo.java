import java.util.Scanner;

public class Demo {
    public static void main(String args[])
    {
        Scanner inp = new Scanner(System.in);


        System.out.println("Enter the text: ");
        String txt = inp.nextLine();
        System.out.println("Enter the Pattern: ");
        String pat = inp.nextLine();
        new KMP().KMPSearch(pat, txt);
    }
}
