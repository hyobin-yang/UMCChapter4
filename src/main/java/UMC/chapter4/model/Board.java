package UMC.chapter4.model;

public class Board {

    private Long id;
    private String title;
    private String content;

    // 생성자
    public Board(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    // getter와 setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "id = " + id + '\n' +
                "title = " + title + '\n' +
                "content = " + content;
    }

}
