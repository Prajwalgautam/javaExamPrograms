import java.util.Scanner;

public class ArrayIntake {
    public void AskArray(){
        int size,i;
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("\nEnter size of array:\t");
        size = scan.nextInt();
        int numbers[] = new int[size];
        scan.close();
        System.out.println("\nEnter "+size+" Numbers:\t");
        for(i = 0; i<size ; i++){
            numbers[i] = scan.nextInt();
            if(numbers[i]%2==0){
                sum+=numbers[i];
            }
        }
        scan.close();
        System.out.println("\nEven number sum is :\t "+sum);
    }
    public static void main(String[] args) {
        ArrayIntake array = new ArrayIntake();
        array.AskArray();
    }
}
