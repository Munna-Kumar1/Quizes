import java.util.Scanner;

public class QuestionService {
    

    Question[] questions=new Question[5];

    String selection[] = new String[5];
    public QuestionService()
    {
        questions[0]= new Question(1,"Size of int?","2","4","6","8","4");
        questions[1]= new Question(2,"Size of double?","2","4","6","8","8");
        questions[2]= new Question(3,"Size of char?","2","4","6","8","2");
        questions[3]= new Question(4,"Size of long?","2","4","6","8","8");
        questions[4]= new Question(5,"Size of short?","2","4","6","8","2");
    }

    public void playQuiz()
    {
        int i=0;
        for(Question q: questions)
        {
            System.out.println("Question no: "+q.getId());
            System.out.println(q.getQuestion());
            System.out.println("Option 1: "+q.getOpt1());
            System.out.println("Option 2: "+q.getOpt2());
            System.out.println("Option 3: "+q.getOpt3());
            System.out.println("Option 4: "+q.getOpt4());

            Scanner sc = new Scanner(System.in);
            System.out.print("Type your answer: ");
            selection[i] =sc.nextLine();
            i++;

        }
        
    }

    public void printScore()
    {
        int score =0;

        for(int i=0;i<questions.length;i++)
        {
            Question que = questions[i];
            String actualanswer = que.getAnswer();
            String userAnswer = selection[i];

            if(actualanswer.equals(userAnswer))
            {
                score++;
            }

        }
        System.out.println("Your score is : "+ score);
    }
     

}
