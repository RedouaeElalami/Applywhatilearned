package LearningClassesObjectsConstructors;

public class Person
{
    private String ln;
    private String fn;
    private int age ;

    public Person(String ln, String fn, int age) {
        this.ln = ln;
        this.fn = fn;
        this.age = age;
    }

    public String getLn() {
        return ln;
    }

    public void setLn(String ln) {
        this.ln = ln;
    }

    public String getFn() {
        return fn;
    }

    public void setFn(String fn) {
        this.fn = fn;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "ln='" + ln + '\'' +
                ", fn='" + fn + '\'' +
                ", age=" + age +
                '}';
    }
}
