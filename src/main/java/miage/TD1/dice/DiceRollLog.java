package miage.TD1.dice;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DiceRollLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int diceCount;

    @ElementCollection
    private List<Integer> results;

    private LocalDateTime timestamp;

    public DiceRollLog() {
    }

    public DiceRollLog(int diceCount, List<Integer> results, LocalDateTime timestamp) {
        this.diceCount = diceCount;
        this.results = results;
        this.timestamp = timestamp;
    }

    public Long getId() {
        return id;
    }

    public int getDiceCount() {
        return diceCount;
    }

    public List<Integer> getResults() {
        return results;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}