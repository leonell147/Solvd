public class Person {
    private int age;
    private String name;
    private float height;
    private float weight;

    public Person(int age, String name, float height, float weight) {
        this.age = age;
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
