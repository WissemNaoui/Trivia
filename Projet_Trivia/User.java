@Entity
// Entité pour représenter un utilisateur
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Identifiant unique pour chaque utilisateur
    private Long id;
    private String username;
    private String password;
    // Getters et setters
}
