package pl.pw.GameStore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.pw.GameStore.model.Game;
import pl.pw.GameStore.service.GameService;

import java.util.List;

@RestController
@RequestMapping("/game")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping("/list")
    public List<Game> getAllGames() {
        return gameService.getAllGames();
    }

    @GetMapping("/{id}")
    public Game getGame(@PathVariable long id) {
        return gameService.findByGameId(id);
    }

    @PostMapping
    public Game createGame(@RequestBody Game game) {

        return gameService.save(game);
    }

    @PutMapping
    public Game updateGame(@RequestBody Game game) {

        return gameService.update(game);
    }


}
