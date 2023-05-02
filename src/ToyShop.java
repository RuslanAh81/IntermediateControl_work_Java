package src;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class ToyShop {
    private String name;
    private static ArrayList<Toy>toys;
    private static Queue<Toy> prizeToyQueue = new LinkedList<>();
    public ToyShop(String name) {
        this.name = name;
        this.toys = new ArrayList<Toy>();
    }

    public static void addToyToShop(int id, String name, int quantity, int chance){
        toys.add(new Toy(id, name, quantity, chance));
        // System.out.println(name + "added");
    }

    public static void showToyLotteryList(LinkedList<Toy>toyList){
        Iterator<Toy> iterator = toyList.iterator();
        System.out.println("____");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("----");
    }

    public static void showToyShopList(LinkedList<ToyShop>toyList) {

        System.out.println(toyList);
    }

    public void addToLotteryList(String name, LinkedList<Toy> LotteryList){
        for (Toy checkedToy : this.toys) {
            //System.out.println("YYYY");
            if(checkedToy.getName().equals(name)){
                LotteryList.add(checkedToy);
                System.out.println(checkedToy.name +" Добавлен в список");
            }
        }
    }

    public static void putToyToPrizeToysQueue() {
        if (toys.isEmpty()) {
            System.out.println("В магазине нет игрушек");
            return;
        }
        ArrayList<Toy> toysByChanceList = new ArrayList<>();
        for (Toy toy : toys) {
            int currentToyChance = toy.getChance();
            for (int i = 0; i < currentToyChance; i++) {
                toysByChanceList.add(toy);
            }
        }
        Collections.shuffle(toysByChanceList);
        Toy toy = toysByChanceList.get(0);
        prizeToyQueue.add(toy);
        toys.remove(toy);
    }

    public static void getPrizeToyAndWrite(String filePath) {
        if (prizeToyQueue.isEmpty()) {
            System.out.println("Призовых игрушек в наличии нет");
            return;
        }
        Toy prizeToy = prizeToyQueue.poll();
        try {
            FileWriter writer = new FileWriter(filePath, true);
            writer.write(prizeToy.getName() + "\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Не удалось записать призовую игрушку в файл");
        }
        System.out.println("Поздравляем! Вы выиграли " + prizeToy.getName());
        toys.remove(prizeToy);
    }

//    public void remove

    @Override
    public String toString() {
        return "ToyShop name"
                + name + '\n' +
                ", toys=" + toys +
                '}';
    }
}
