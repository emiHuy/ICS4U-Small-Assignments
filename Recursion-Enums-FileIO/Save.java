import java.io.*;
import java.util.logging.Logger;
import java.util.logging.Level;

public class Save{
    private String series;
    private double start;
    private int numTerms;
    private double sum;
    private String other;

    public Save(String series, double start, int numTerms, double sum, String other){
        this.series = series;
        this.start = start;
        this.numTerms = numTerms;
        this.sum = sum;
        this.other = other;
        saveSum();
    }

    private void saveSum(){
        try{
            FileWriter fileWrite = new FileWriter("sums.txt", true);
            BufferedWriter buffWrite = new BufferedWriter(fileWrite);
            String otherVariable = determineVariable(series);
            // Writes sums to sums.txt file in the format below
            // Format: series category, starting value, number of terms, other variable (dependent on the given series), resulting sum
            buffWrite.write("Series Category: " + series + "\nStarting value: " + start + "\nNumber of terms: " + numTerms + "\n" + otherVariable + other + "\nSum: " + sum + "\n");
            buffWrite.newLine();
            buffWrite.close();
        }
        catch(FileNotFoundException e){
            System.out.println("File not found.");
        }
        catch (IOException ex){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private String determineVariable(String series){
        switch(series){
            case "ARITHMETIC":
                return "Common difference: ";
            case "GEOMETRIC":
                return "Common ratio: ";
            case "FIBONACCI":
                return "Second term value: ";
            case "HARMONIC":
                return "Change in interval: ";
            default:
                return null;
        }
    }
}