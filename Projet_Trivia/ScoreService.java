@Service
// Service pour gérer les scores
public class ScoreService {
    @Autowired
    private ScoreRepository scoreRepository;

    public Score getScore(Long id) {
        // Récupérer un score par identifiant
        return scoreRepository.findById(id).orElseThrow();
    }

    public List<Score> getAllScores() {
        // Récupérer tous les scores
        return scoreRepository.findAll();
    }
}
