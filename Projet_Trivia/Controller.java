@RestController
@RequestMapping("/api")
// Contrôleur pour gérer les requêtes API
public class Controller {
    @Autowired
    private UserService userService;
    @Autowired
    private GameService gameService;
    @Autowired
    private QuestionService questionService;
    @Autowired
    private ScoreService scoreService;

    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        // Créer un nouvel utilisateur
        return userService.createUser(user);
    }

    @GetMapping("/games")
    public List<Game> getAllGames() {
        // Récupérer tous les jeux
        return gameService.getAllGames();
    }

    @GetMapping("/questions")
    public List<Question> getAllQuestions() {
        // Récupérer toutes les questions
        return questionService.getAllQuestions();
    }

    @PostMapping("/scores")
    public Score createScore(@RequestBody Score score) {
        // Créer un nouveau score
        return scoreService.createScore(score);
    }
}
