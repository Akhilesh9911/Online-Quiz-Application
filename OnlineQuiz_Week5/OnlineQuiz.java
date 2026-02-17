import java.util.Scanner;

public class OnlineQuiz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Questions
        String[] questions = {
                "1. Java is a ____?",
                "2. Which keyword is used to inherit a class?",
                "3. JVM stands for?",
                "4. Which of these is not a Java primitive data type?",
                "5. Which method is the entry point of a Java program?"
        };

        // Options (2D Array)
        String[][] options = {
                {"A. Language", "B. OS", "C. Hardware", "D. Browser"},
                {"A. super", "B. this", "C. extends", "D. implements"},
                {"A. Java Virtual Machine", "B. Java Visual Model", "C. Just VM", "D. None"},
                {"A. int", "B. float", "C. String", "D. boolean"},
                {"A. start()", "B. main()", "C. run()", "D. init()"}
        };

        // Correct Answers
        char[] answers = {'A', 'C', 'A', 'C', 'B'};

        int score = 0;

        System.out.println("===== Welcome to Online Quiz =====");

        // Loop through questions
        for (int i = 0; i < questions.length; i++) {

            System.out.println("\n" + questions[i]);

            // Print options
            for (int j = 0; j < options[i].length; j++) {
                System.out.println(options[i][j]);
            }

            System.out.print("Enter your answer (A/B/C/D): ");
            char userAnswer = sc.next().toUpperCase().charAt(0);

            // Check answer
            if (userAnswer == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! Correct answer is: " + answers[i]);
            }
        }

        // Final Result
        System.out.println("\n===== Quiz Completed =====");
        System.out.println("Your Final Score: " + score + "/" + questions.length);

        // Performance Message
        if (score == questions.length) {
            System.out.println("Excellent Performance!");
        }
        else if (score >= 3) {
            System.out.println("Good Job!");
        }
        else {
            System.out.println("Keep Practicing!");
        }

        sc.close();
    }
}
