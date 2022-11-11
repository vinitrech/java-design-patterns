package behavioral.memento;

import java.util.ArrayList;

public class Caretaker {
    ArrayList<Memento> savedArticles = new ArrayList<Memento>();

    public void addMemento(Memento memento) {
        savedArticles.add(memento);
    }

    public Memento getMemento(int index){
        return savedArticles.get(index);
    }
}
