package vadik.les_8;

import vadik.les_8.Answer;
import vadik.les_8.Question;

import java.util.Scanner;

public class MainA {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Question[] questions = new Question[10];
        questions[0] = new Question("Сколько будет 2 + 2 ?", new String[]{"3", "4", "5", "6"}, 1);
        questions[1] = new Question("Сколько будет 5 + 2 ?", new String[]{"8", "10", "7", "6"}, 2);
        questions[2] = new Question("Сколько будет 0 + 2 ?", new String[]{"2", "-2", "4", "45"}, 0);
        questions[3] = new Question("Сколько будет 3 + 2 ?", new String[]{"2", "5", "4", "-5"}, 1);
        questions[4] = new Question("Сколько будет -5 + 2 ?", new String[]{"2", "-1", "1", "-3"}, 3);
        questions[5] = new Question("Сколько будет 0 * 0 ?", new String[]{"3", "4", "0", "1"}, 2);
        questions[6] = new Question("Сколько будет 2 * 8 ?", new String[]{"4", "16", "0", "-3"}, 1);
        questions[7] = new Question("Сколько будет 81 / 9 ?", new String[]{"9", "10", "7", "6"}, 0);
        questions[8] = new Question("Сколько будет 12 / 3 + 2 ?", new String[]{"2", "-1", "1", "6"}, 3);
        questions[9] = new Question("Сколько будет 12 * 0 / 5 * 4 + 2 ?", new String[]{"3", "2", "0", "1"}, 1);

        Answer[] answers = new Answer[10];
        String answer;
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i].getQuestion());
            System.out.print(questions[i].showOptions());
            answer = sc.nextLine();
            answers[i] = new Answer(questions[i], answer);

            if (answers[i].isCorrect())
                score++;
        }
        System.out.printf("Твоя оценка - %d из 10!;\n", score);

        if (score != 10) {
            for (Answer a :
                    answers) {
                if (!a.isCorrect())
                    a.truth();
            }

        }


    }

}
