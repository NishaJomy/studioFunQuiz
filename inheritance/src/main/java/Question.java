public abstract class Question {
    //class variables
    private final String question;
    private final String answer;
    //constructor

    public Question(String question,String answer) {
        this.question = question;
        this.answer = answer;
    }
    //Getters

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    //method
    public abstract boolean checkAnswer(String answer);
}
