package SEDay02;


public class person {
    String name;
    String id;
    public String getId() {

        return id;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    public person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
