public class QuizRunner {
    public static void main(String[] args) {
        Quiz myQuiz = new Quiz();

        MultipleChoice multipleChoice = new MultipleChoice("Who is American President? "+"\n"+"A:Biden\n"+"B:Trump","A");
        myQuiz.addQuestion(multipleChoice);

        TrueFalse trueFalse = new TrueFalse("is st louis arch a world wondwers?\n"+"A:Niagra\n"+"B:Tajmahal\n"+"C:Tower\n","A,B");
        myQuiz.addQuestion(trueFalse);

        myQuiz.addQuestion(multipleChoice);


        myQuiz.runQuiz();

    }
}
