import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    /*Add questions,Run or carry out the quiz,Grade the quiz*/
   //class variables
    private ArrayList<Question> questions = new ArrayList<Question>();
    private Scanner scanner = new Scanner(System.in);
   //constructor
    private int numberQuestionsCorrect = 0;
    public Quiz() {

    }

    //getters and setters
   //methods
   public void addQuestion(Question question){
        this.questions.add(question);
   }
   public void runQuiz(){
      for(Question question : questions){
          System.out.println(question.getQuestion());
          String usersAnswer = scanner.nextLine();
          boolean userGotCorrectAnswer = question.checkAnswer(usersAnswer);
          if(userGotCorrectAnswer){
              this.numberQuestionsCorrect++;
          }
      }
      double percentage = (this.numberQuestionsCorrect / this.questions.size())*100 ;
       System.out.println("The percetage is: "+percentage+"%");
   }


}
