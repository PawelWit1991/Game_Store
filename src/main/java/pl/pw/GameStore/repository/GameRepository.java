package pl.pw.GameStore.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import pl.pw.GameStore.model.Game;

public interface GameRepository extends JpaRepository<Game, Long> {


}
