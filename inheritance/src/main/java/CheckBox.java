public class CheckBox extends Question {
    //classvariables
    //constructor

    public CheckBox(String question, String answer) {
        super(question, answer);
    }
    //getters
    //methods

    @Override
    public boolean checkAnswer(String answer) {
        String correctAnswer = this.getAnswer();
        if (answer.toLowerCase().equals(correctAnswer.toLowerCase())) {
            return true;
        } else {
            return false;
        }
    }
}