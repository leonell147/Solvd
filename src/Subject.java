import java.util.ArrayList;

public class Subject {
    private Degree degree;
    private ArrayList<Subject> correlative;
    private ArrayList<String> topics;

    public Subject(Degree degree) {
        this.degree = degree;
    }

    public ArrayList<Subject> getCorrelative() {
        return correlative;
    }

    public void setCorrelative(ArrayList<Subject> correlative) {
        this.correlative = correlative;
    }

    public ArrayList<String> getTopics() {
        return topics;
    }

    public void setTopics(ArrayList<String> topics) {
        this.topics = topics;
    }
    public void addTopics(ArrayList<String> topics){
        this.topics.addAll(topics);
    }
}
