package chap14_lambda.sec05_std_api_func_interface.exam06_predicate;

public class Student {
    private String name;
    private String sex;
    private int score;

    public Student(String name, String sex, int score) {
        this.name = name;
        this.sex = sex;
        this.score = score;
    }

    public String getSex() { return sex; }
    public int getScore() { return score; }
}

