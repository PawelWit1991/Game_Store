package pl.pw.GameStore;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/game")
public class GameApi {

private List<Game> games;


public GameApi(){
    games=new ArrayList<>();
    games.add(new Game(1L, "Witcher", LocalDate.of(2014,1,1) ));
    games.add(new Game(2L, "Counter-Strike", LocalDate.of(2004,1,1) ));
    games.add(new Game(3L, "Mario-Bros", LocalDate.of(1980,1,1) ));
}


@GetMapping("/all")
public List<Game> getAll(){
    return games;
    }


    @GetMapping
    public Game getById(@RequestParam int index){

        Optional<Game> first= games.stream().filter(element -> element.getId() == index).findFirst();
        return first.get();
    }

    
}
