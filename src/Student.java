import java.util.LinkedList;

public class Student extends Person{
    private Degree degree;
    private LinkedList<Subject> currentSubjects;


    public Student(int age, String name, float height, float weight) {
        super(age, name, height, weight);
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public LinkedList<Subject> getCurrentSubjects() {
        return currentSubjects;
    }

    public void setCurrentSubjects(LinkedList<Subject> currentSubjects) {
        this.currentSubjects = currentSubjects;
    }
}
