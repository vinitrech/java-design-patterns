package behavioral.memento;

public class Memento {
    private String article;

    public Memento(String article) {
        this.article = article;
    }

    public String getSavedArticle() {
        return this.article;
    }

}
