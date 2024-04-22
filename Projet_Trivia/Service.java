@Service
// Service pour gérer les utilisateurs
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        // Créer un nouvel utilisateur
        return userRepository.save(user);
    }

    public User getUserByUsername(String username) {
        // Récupérer un utilisateur par nom d'utilisateur
        return userRepository.findByUsername(username);
    }
}
