package java2;

import java.util.LinkedHashMap;
import java.util.ArrayList;

// Manages and tallies up votes for each candidate.
public class Vote{
    private static LinkedHashMap<Candidate, Integer> voteCollection = new LinkedHashMap<Candidate, Integer>();
    private static int numVotes = 0;
    private int votedCandidateIndex;

    // Initializes Hashtable by setting each candidate's votes to 0.
    public static void initialize(){
        ArrayList<Candidate> candidatesList = Candidate.getCandidatesList();
        for(int x = 0; x < candidatesList.size(); x++){
            voteCollection.put(candidatesList.get(x), 0);
        }
    }

    public Vote(int vote){
        // Computes candidate index from vote.
        votedCandidateIndex = vote-1;
        addVoteToCandidate();
    }

    // Adds vote to corresponding candidate's vote count.
    private void addVoteToCandidate(){
        Candidate candidate = Candidate.getCandidatesList().get(votedCandidateIndex);
        voteCollection.put(candidate, voteCollection.get(candidate)+ 1);
        numVotes++;
        System.out.println("Vote registered for Candidate " + (votedCandidateIndex+1) + ".");
    }

    public static LinkedHashMap<Candidate, Integer> getVoteCollection(){
        return new LinkedHashMap<Candidate, Integer> (voteCollection);
    }

    public static int getNumVotes(){
        return numVotes;
    }
}