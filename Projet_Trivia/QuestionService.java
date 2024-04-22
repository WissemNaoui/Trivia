@Service
// Service pour gérer les questions
public class QuestionService {
    @Autowired
    private QuestionRepository questionRepository;

    public Question getQuestion(Long id) {
        // Récupérer une question par identifiant
        return questionRepository.findById(id).orElseThrow();
    }

    public List<Question> getAllQuestions() {
        // Récupérer toutes les questions
        return questionRepository.findAll();
    }
}
