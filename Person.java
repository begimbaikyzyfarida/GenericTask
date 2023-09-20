package Model;

public class Person {


    private int age;
    private String name;

    public static int id;
    private int instanceId;


    public Person(int age, String name) {
        this.age = age;
        this.name = name;
        this.instanceId = id++;
    }




    public String getName() {
        return name;
    }



    public int getInstanceId() {
        return instanceId;
    }



    @Override
    public String toString() {
        return "Model.Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", instanceId=" + instanceId +
                '}';
    }
}
