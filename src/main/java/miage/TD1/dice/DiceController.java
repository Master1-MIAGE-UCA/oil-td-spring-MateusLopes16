package miage.TD1.dice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiceController {

    @Autowired
    private DiceService diceService;

    @GetMapping("/rollDice")
    public int rollDice() {
        return diceService.rollDices(1).get(0);
    }

    @GetMapping("/rollDices/{count}")
    public List<Integer> rollDices(@PathVariable int count) {
        return diceService.rollDices(count);
    }
}