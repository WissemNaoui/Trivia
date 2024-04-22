@Entity
// Entité pour représenter un jeu
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Identifiant unique pour chaque jeu
    private Long id;
    private String name;
    private String description;
    // Getters et setters
}
