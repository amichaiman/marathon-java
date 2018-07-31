package test;

public class Person implements Comparable{
    private int id;
    private int age;
    private String name;


    public Person(int id, String name) {
        this.id = id;
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

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Object o) {
        Person p = (Person)o;

        return age - p.getAge();
    }

    @Override
    public boolean equals(Object o) {
        return ((Person)o).getId() == id;
    }
}
