class MCQuestion{
	// attributes
	private String correctAnswer;
	private String question;
	private String optionA;
	private String optionB;
	private String optionC;
	private String optionD;

	// constructors
	public MCQuestion(){
		optionA = "";
		optionB = "";
		optionC = "";
		optionD = "";
		correctAnswer = "";
		question = "";
	}
	
	public MCQuestion(String q, String a, String b, String c, String d, String answerKey){
		question = q;
		optionA = a;
		optionB = b;
		optionC = c;
		optionD = d;
		correctAnswer = answerKey;
	}

	// getters and setters
	public String getOptA(){
		return optionA;
	}

	public String getOptB(){
		return optionB;
	}

	public String getOptC(){
		return optionC;
	}
	public String getOptD(){
		return optionD;
	}
	public String getCorrectAnswer(){
		return correctAnswer;
	}

	public String getQuestion(){
		return question;
	}

	public void setOptA(String a){
		optionA = a;
	}

	public void setOptB(String b){
		optionB = b;
	}
	public void setOptC(String c){
		optionC = c;
	}
	public void setOptD(String d){
		optionD = d;
	}
	public void setCorrectAnswer(String answerKey){
		correctAnswer = answerKey;
	}

	public void setQuestion(String q){
		question = q;
	}
	
	// class methods
	public void display(){
		System.out.println(question);
		System.out.println("a. " + optionA);
		System.out.println("b. " + optionB);
		System.out.println("c. " + optionC);
		System.out.println("d. " + optionD);
		System.out.print("What is the letter answer? ");
	}

	public void checkAnswer(String userGuess){
		if(userGuess.equalsIgnoreCase(correctAnswer)){
			System.out.println("Yes, " + userGuess + " is correct!\n");
		}
		else{
			System.out.println("Sorry, that is incorrect. The correct answer is " + getCorrectAnswer()+".\n");
		}
	}
}