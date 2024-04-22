@Entity
// Entité pour représenter un score
public class Score {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Identifiant unique pour chaque score
    private Long id;
    private Long userId;
    private Long gameId;
    private Integer score;
    // Getters et setters
}
