import java.util.*;

class QuizGame {
    static String[] questions = {
        "What is the capital of UAE?",
        "What is 2 + 8?",
        "Which planet is known as the Red Planet?"
    };

    static String[][] options = {
        {"1. Berlin", "2. Madrid", "3.Abu Dhabi ", "4. Rome"},
        {"1. 3", "10", "3. 5", "4. 6"},
        {"1. Earth", "2. Mars", "3. Venus", "4. Jupiter"}
    };

    static int[] correctAns = {3, 2, 2}; 
    static int score = 0; 

    
    static final int TIME_LIMIT = 10; 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        for (int i = 0; i < questions.length; i++) {
            
            System.out.println("\n" + questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }

       
            long startTime = System.currentTimeMillis();
            System.out.print("You have " + TIME_LIMIT + " seconds to answer. Enter your choice (1-4): ");
            String userAnswer = sc.nextLine();

           
            if ((System.currentTimeMillis() - startTime) > (TIME_LIMIT * 1000)) {
                System.out.println("Time's up!");
            } else {
               
                int answer = Integer.parseInt(userAnswer);
                if (answer == correctAns[i]) {
                    System.out.println("Correct!");
                    score++;
                } else {
                    System.out.println("Incorrect! The correct answer was option " + correctAns[i]);
                }
            }
        }

        System.out.println("\nYour final score is: " + score + "/" + questions.length);
        sc.close();
    }
}
