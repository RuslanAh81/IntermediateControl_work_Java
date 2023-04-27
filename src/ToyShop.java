package src;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ToyShop {
    private String name;
    private ArrayList<Toy>toys;
    public ToyShop(String name) {
        this.name = name;
        this.toys = new ArrayList<Toy>();
    }

    public void addToyToShop(int id, String name, int quantity, int chance){
        toys.add(new Toy(id, name, quantity, chance));
        // System.out.println(name + "added");
    }

    public void showToyLotteryList(LinkedList<Toy>toyList){
        Iterator<Toy> iterator = toyList.iterator();
        System.out.println("____");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("----");
    }

    public void showToyShopList(LinkedList<ToyShop>toyList) {
        for (int i = 0; i < toyList.size(); i++) {
            Iterator<ToyShop> iterator = toyList.iterator();
            System.out.println("____");
            while (iterator.hasNext()) {
                System.out.println(iterator.next().toString());
            }
            System.out.println("----");
        }
    }

    public void addToLotteryList(String name, LinkedList<Toy> LotteryList){
        for (Toy checkedToy :this.toys) {
            if(checkedToy.getName().equals(name)){
                LotteryList.add(checkedToy);
            }
        }
    }

//    @Override
//    public String toString() {
//        return "ToyShop name"
//                 + name + '\n' +
//                ", toys=" + toys +
//                '}';
//    }
}
