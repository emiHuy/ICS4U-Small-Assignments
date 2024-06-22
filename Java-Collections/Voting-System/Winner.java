package java2;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Collections;

// Winner class determines the winner(s)
public class Winner{
    private static LinkedList<Candidate> winners = new LinkedList<Candidate>();
    private static int highestVoteCount = Collections.max(Vote.getVoteCollection().values());

    public Winner(){
        findWinner();
    }

    // Finds candidate(s) with the highest number of votes and adds them to winners list.
    private static void findWinner(){
        LinkedHashMap<Candidate, Integer> votesCollected = Vote.getVoteCollection();
        for(Candidate candidate : votesCollected.keySet()){
            if(votesCollected.get(candidate) == (highestVoteCount)){
                winners.add(candidate);
            }
        }
    }

    public String toString(){
        String winnerDisplay = "Winner(s):";
        for(Candidate winner : winners){
            // Add winner information to returnable string.
            winnerDisplay = winnerDisplay + ("\nID: " + winner.getId() + ", Name: " + winner.getName() + ", Votes: " + highestVoteCount);
        }
        return winnerDisplay;
    }

    public LinkedList<Candidate> getWinners(){
        return winners;
    }
}