package pl.pw.GameStore.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table
public class Game {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private LocalDate productionYear;

    public Game() {
    }

    public Game(Long id) {
        this.id = id;
    }

    public Game(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    public Game(Long id, String title, LocalDate productionYear) {
        this.id = id;
        this.title = title;
        this.productionYear = productionYear;
    }

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

    public LocalDate getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(LocalDate productionYear) {
        this.productionYear = productionYear;
    }
}
