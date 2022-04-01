import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        String name ;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter something");
        name = scan.nextLine();
        System.out.println("The name you entered is :\t"+name);
        scan.close();
    }
}
