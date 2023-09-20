package Model;

public class Animal {

    private String name;
    private int age;

    public static int id;

    private int instanceId;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
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
        return "Model.Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", instanceId=" + instanceId +
                '}';
    }
}
