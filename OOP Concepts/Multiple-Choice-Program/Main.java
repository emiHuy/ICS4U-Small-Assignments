import java.util.Scanner;
class Main {
  public static void main(String[] args) {
	  // Your driver code here: create the Circle object and call your object method(s)
	  Scanner input = new Scanner(System.in);

	  // Creating question using constructor with parameters
	  MCQuestion q1 = new MCQuestion("What type of method is typically declared as private and static?", "Constructor","Instance","Class","Helper","d");
	  q1.display();
	  String userAnswer = input.next();
	  q1.checkAnswer(userAnswer);
	  
	  // Creating question using default constructor and setter methods
	  MCQuestion q2 = new MCQuestion();
	  q2.setQuestion("Who made this program? ");
	  q2.setOptA("Kyle");
	  q2.setOptB("Emily");
	  q2.setOptC("Oscar");
	  q2.setOptD("Ms. Luce");
	  q2.setCorrectAnswer("b");
	  q2.display();
	  userAnswer = input.next();
	  q2.checkAnswer(userAnswer);

	  // Showing use of getters
	  System.out.println("Question 2: " + q2.getQuestion());
	  System.out.println("Option A: " + q2.getOptA());
	  System.out.println("Option B: " + q2.getOptB());
	  System.out.println("Option C: " + q2.getOptC());
	  System.out.println("Option D: " + q2.getOptD());
	  System.out.println("Correct Answer: " + q2.getCorrectAnswer());
  }
}