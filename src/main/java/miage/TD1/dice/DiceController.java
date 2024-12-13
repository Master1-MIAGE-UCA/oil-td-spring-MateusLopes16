package miage.TD1.dice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiceController {

    @Autowired
    private Dice dice;

    @GetMapping("/rollDice")
    public int rollDice() {
        return dice.roll();
    }

    @GetMapping("/rollDices/{count}")
    public List<Integer> rollDices(@PathVariable int count) {
        List<Integer> results = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            results.add(dice.roll());
        }
        return results;
    }
}