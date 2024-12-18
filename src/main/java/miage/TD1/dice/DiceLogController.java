package miage.TD1.dice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiceLogController {

    @Autowired
    private DiceRollLogRepository diceRollLogRepository;

    @GetMapping("/diceLogs")
    public List<DiceRollLog> getDiceLogs() {
        List<DiceRollLog> logs = diceRollLogRepository.findAll();
        System.out.println("Retrieved DiceRollLogs: " + logs);
        return logs;
    }
}