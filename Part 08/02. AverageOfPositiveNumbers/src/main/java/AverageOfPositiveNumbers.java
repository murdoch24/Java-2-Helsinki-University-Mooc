
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        
        while (true){
            int userInput = Integer.valueOf(scanner.nextLine());
            
            if (userInput == 0){
                break;
            }else if (userInput > 0){
                count ++;
                sum = sum + userInput;
            }
            
            
        }
        
        if (count == 0){
            System.out.println("Cannot calculate the average");
        }else{
        
            double average = (double) sum / (double) count;
        
       
        
            System.out.println(average);
        }

    }
}
