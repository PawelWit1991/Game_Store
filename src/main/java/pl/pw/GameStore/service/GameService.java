package pl.pw.GameStore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.pw.GameStore.model.Game;
import pl.pw.GameStore.repository.GameRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class GameService {

    @Autowired
    private GameRepository gameRepository;


    public Game save(Game game) {
        return gameRepository.save(game);
    }

    public Game update(Game game) {

        return gameRepository.findById(game.getId()).map(gamedb -> {

            if (game.getTitle() != null) {
                gamedb.setTitle(game.getTitle());
            }
            if (game.getProductionYear() != null) {
                gamedb.setProductionYear(game.getProductionYear());
            }
            return gameRepository.save(gamedb);
        }).orElse(null);
    }

    public void delete(Long id) {
        gameRepository.deleteById(id);
    }

    public List<Game> getAllGames(){
        return gameRepository.findAll();
    }

    public Game findByGameId(Long id){
        return gameRepository.findById(id).orElse(null);
    }
}
