package vadik.les_8;

public class Answer {
    private Question question;
    private String answer;

    public Answer(Question question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public Question getQuestion() {
        return question;
    }

    public void truth(){
        System.out.printf("Вопрос : \n - %s;\n", question.getQuestion());
        System.out.printf("Твой ответ - %s;\n", answer);
        System.out.printf("Правильный ответ - %s;\n", getCorrectAnswer());
    }

    public String getCorrectAnswer() {
        return question.getOptions()[question.getCorrect_index()];
    }


    public String getAnswer() {
        return answer;
    }

    public boolean isCorrect() {
        int index_answer = -1;

        for (int i = 0; i < question.getOptions().length; i++) {
            if (question.getOptions()[i].compareTo(answer) == 0)
                index_answer = i;
        }
        if (question.getCorrect_index() == index_answer)
            return true;
        return false;
    }
}
