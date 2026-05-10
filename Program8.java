class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public void showData() {
        System.out.println("Name  : " + name);
        System.out.println("Score : " + score);
    }

    public void checkStatus() {
        if (score >= 75) {
            System.out.println("Status: Passed");
        } else {
            System.out.println("Status: Failed");
        }
    }
}

public class Program8 {

    public static void main(String[] args) {

        Student student = new Student("Petra", 88);

        student.showData();
        student.checkStatus();
    }
}