@Entity
// Entité pour représenter une question
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Identifiant unique pour chaque question
    private Long id;
    private String text;
    private String category;
    // Getters et setters
}
