package vadik.les_8;

public class Question {
    private String question;
    private String[] options;
    private int correct_index;

    public int getCorrect_index() {
        return correct_index;
    }

    public String[] getOptions() {
        return this.options;
    }
    public String showOptions() {
        String str = "Варианты ответа: \n";
        for (int i = 0; i < options.length; i++) {
            str += "- " + options[i] + ";\n";
        }
        return str;
    }

    public String getQuestion() {
        return question;
    }

    public Question(String question, String[] options, int correct_index) {
        this.question = question;
        this.options = options;
        this.correct_index = correct_index;
    }
}
