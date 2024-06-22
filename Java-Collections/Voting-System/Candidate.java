package java2;

import java.util.ArrayList;

public class Candidate{
    private static ArrayList<Candidate> candidatesList = new ArrayList<Candidate>();
    private String name;
    private int id;

    public Candidate(String aName, int index){
        name = aName;
        id = index+1;
        addCandidateToList();
    }

    private void addCandidateToList(){
        candidatesList.add(this);
    }

    public static ArrayList<Candidate> getCandidatesList(){
        return new ArrayList<Candidate>(candidatesList);
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public void setName(String newName){
        name = newName;
    }
}