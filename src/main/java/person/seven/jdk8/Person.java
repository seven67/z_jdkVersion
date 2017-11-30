package person.seven.jdk8;

/**
 * @author liuqi
 * @create 2017-11-30
 **/
public class Person {

    private String name;
    private boolean isStudent;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStudent() {
        return isStudent;
    }

    public void setStudent(boolean student) {
        isStudent = student;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Person(String name, boolean isStudent, Integer age) {
        this.name = name;
        this.isStudent = isStudent;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", isStudent=" + isStudent +
                ", age=" + age +
                '}';
    }
}
