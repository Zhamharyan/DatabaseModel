package service.model;

public class Director {
    private static int count;

    private int id;
    private String name;
    private int age;
    public Director(String name,int age){
        this.age = age;
        this.name = name;
        count++;
        this.id = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }
}
