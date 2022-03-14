import java.util.ArrayList;

public class Departament {
    private University university;
    private ArrayList<Degree> degrees;

    public Departament(University university) {
        this.university = university;
    }

    public University getUniversity() {
        return university;
    }

    public ArrayList<Degree> getDegrees() {
        return degrees;
    }

    public void addDegrees(ArrayList<Degree> degrees) {
        this.degrees.addAll(degrees);
    }

    public void setUniversity(University university) {
        this.university = university;
    }
}
