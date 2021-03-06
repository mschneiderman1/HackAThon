import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Questionnaire {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner input = new Scanner(new File("sample.txt"));
        PrintStream output = new PrintStream(new File("OutputAnswers.txt"));
        double[] waterGallons = {2.1, 1800, 30, 6, 3, 16.5, 53};
        double[] array = createArray(input);
        printOutput(output, array, waterGallons);

    }
    public static double[] createArray(Scanner input){
        double[] array  = new double[7];
        int i = 0;
        while(input.hasNext()){
            array[i] = input.nextInt();
            i++;
        }
        return array;
    }

    public static void printOutput(PrintStream output, double[] array, double[] waterGallons){
        double total = 0.0;
        for(int i = 0; i < array.length; i++){
            double gallons = waterGallons[i] * array[i];
            if(i == 0){
                total += gallons * 7;
            }
            total += waterGallons[i] * array[i];
        }
        output.println("You use " + total + " gallons of water each week.");

    }
}
