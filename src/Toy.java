package src;

public class Toy {
    int id;
    String name;
    int quantity;
    int chance;

    public Toy(int id, String name, int quantity, int chance) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.chance = chance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getChance() {
        return chance;
    }

    @Override
    public String toString() {
        return "\nToy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", chance=" + chance +
                '}';
    }

    public void setChance(int chance) {
        this.chance = chance;
    }
}
