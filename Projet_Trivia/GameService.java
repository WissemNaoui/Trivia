@Service
// Service pour gérer les jeux
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    public Game getGame(Long id) {
        // Récupérer un jeu par identifiant
        return gameRepository.findById(id).orElseThrow();
    }

    public List<Game> getAllGames() {
        // Récupérer tous les jeux
        return gameRepository.findAll();
    }
}
