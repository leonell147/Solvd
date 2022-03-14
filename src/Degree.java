import java.util.ArrayList;

public class Degree {
    private String name;
    private Departament departament;
    private ArrayList<Subject> subjects;

    public Degree(String name, Departament departament){
        this.name= name;
        this.departament=departament;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    public void addSubjects(ArrayList<Subject> subject) {
        this.subjects.addAll(subject);
    }

    public Departament getDepartament() {
        return departament;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }
}
