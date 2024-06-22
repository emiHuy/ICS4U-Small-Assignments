package java2;

import java.util.Scanner;
import java.util.ArrayList;

// Orchestrates the voting process, including candidate registration, vote collection, and winner determination .
public class Main2 {

    public static void main(String[] args) {
        candidateRegistration();
        voteCollection();
        determineWinner();
    }

    // Takes in candidate information.
    private static void candidateRegistration(){
        int numOfCandidates = 0;
        String candidateName;

        // Get number of candidates.
        numOfCandidates = getValidIntInput("Enter the number of candidates: ", 2, Integer.MAX_VALUE, "Invalid number of candidates. Please enter an integer.");
        System.out.println();
        // Collect candidate names.
        for(int candidateIndex = 0; candidateIndex < numOfCandidates; candidateIndex++){
            candidateName = getValidStrInput("Enter the name of candidate " + (candidateIndex+1) + ": ");
            new Candidate(candidateName, candidateIndex);
        }
    }

    // Takes in votes from users.
    private static void voteCollection(){
        int voteInput = -1;
        ArrayList<Candidate> candidatesList = Candidate.getCandidatesList();
        int numOfCandidates = candidatesList.size();

        Vote.initialize();
        do{
            System.out.println("\nCandidates:");
            for(int x = 0; x < numOfCandidates; x++){
                System.out.println(x+1 + ". " + candidatesList.get(x).getName());
            }
            voteInput = getValidIntInput("Enter the ID of the candidate you want to vote for (or enter 0 to stop): ", 0, numOfCandidates, "Invalid candidate id. Please enter an integer.");
            if(voteInput != 0){
                new Vote(voteInput);
            }
        } while(voteInput != 0);
    }

    private static void determineWinner(){
        System.out.println();
        Winner winner = new Winner();
        System.out.println(winner.toString());
    }

    // Gets valid integer input.
    private static int getValidIntInput(String prompt, int min, int max, String noIntErrorMsg){
        Scanner in = new Scanner(System.in);
        int input = -1;
        boolean isInvalid;

        do{
            isInvalid = false;
            try{
                System.out.print(prompt);
                input = Integer.parseInt(in.nextLine());
                // Check if input for the number of candidates is out of range.
                if(input < min && min == 2){
                    isInvalid = true;
                    System.out.println("A minimum of two candidates must be entered.\n");
                }
                // Check if input for candidate voting is out of range.
                else if(input < min || input > max){
                    isInvalid = true;
                    System.out.println("Invalid candidate id. Input must be in between " + min + " and " + max + ", inclusive.\n");
                }
                // Check if input is empty.
                else if(String.valueOf(input).equals(null)){
                    isInvalid = true;
                    System.out.println(noIntErrorMsg + "\n");
                }
                // Check if no votes have been entered before stop signal.
                else if(input == 0 && Vote.getNumVotes() == 0){
                    System.out.println("A minimum of one vote must be entered.\n");
                    isInvalid = true;
                }
                // Throws exception if a non-integer is entered.
            } catch (NumberFormatException e){
                System.out.println(noIntErrorMsg + "\n");
                isInvalid = true;
            }
        }while(isInvalid);
        return input;
    }

    // Gets valid string input.
    private static String getValidStrInput(String prompt){
        Scanner in = new Scanner(System.in);
        String input;
        boolean isInvalid;

        do{
            isInvalid = false;
            System.out.print(prompt);
            input = in.nextLine().trim();

            // Check if input is empty.
            if(input.isEmpty()){
                isInvalid = true;
                System.out.println("Please enter the candidate's name.\n");
            }
            // Check if input contains characters other than letters and spaces.
            else if(!input.matches("[a-zA-Z ]+")){
                isInvalid = true;
                System.out.println("Candidate's name cannot contain characters other than letters or spaces.\n");
            }
            // Check if name (input) is already taken by another candidate.
            else{
                for(Candidate candidate : Candidate.getCandidatesList()){
                    if(candidate.getName().equals(input)){
                        isInvalid = true;
                        System.out.println("Candidate already exists. If entering a new candidate, please use a different name.\n");
                        break;
                    }
                }
            }
        }while(isInvalid);
        return input;
    }
}