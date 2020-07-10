package cn.itcyt.java.domain;

public class Server {
    int weight;
    String name;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Server{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }
}
