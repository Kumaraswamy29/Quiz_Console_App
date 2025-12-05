import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[5];
    String[] selection = new String[5];

    public QuestionService() {
       questions[0] = new Question(1, "What is the size of int in Java?",
        "2 bytes", "4 bytes", "8 bytes", "16 bytes", "2");

questions[1] = new Question(2, "What is the size of double in Java?",
        "4 bytes", "6 bytes", "8 bytes", "16 bytes", "3");

questions[2] = new Question(3, "What is the size of char in Java?",
        "1 byte", "2 bytes", "4 bytes", "8 bytes", "2");

questions[3] = new Question(4, "What is the size of long in Java?",
        "4 bytes", "6 bytes", "8 bytes", "16 bytes", "3");

questions[4] = new Question(5, "What is the size of boolean in Java?",
        "1 bit", "1 byte", "2 bytes", "4 bytes", "2");

    }

    public void PlayQuiz() {
        Scanner sc = new Scanner(System.in);
        int i = 0;

        for (Question q : questions) {
            System.out.println("\nQuestion no: " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println("1) " + q.getOpt1());
            System.out.println("2) " + q.getOpt2());
            System.out.println("3) " + q.getOpt3());
            System.out.println("4) " + q.getOpt4());

            System.out.print("Enter your answer: ");
            selection[i] = sc.nextLine();
            i++;
        }
    }

    public void PrintScore() {
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            if (questions[i].getAnswer().equals(selection[i])) {
                score++;
            }
        }

        System.out.println("\nYour Score: " + score + " out of " + questions.length);
    }
}
