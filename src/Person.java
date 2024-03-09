import javax.lang.model.element.Name;

public class Person implements Comparable<Person>{
    private int age;
    private  String name;
    public Person(int age , String name){
        this.age = age;
        this.name = name;
    }
    public String getName(){
        return  name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " " + String.valueOf(age);
    }

    @Override
    public int compareTo(Person o) {
        if (this.age < o.age){
            return -1;
        } else if (this.age == o.age){
            return 0;
        } else{
            return 1;
        }
    }
}
