package bruce.dev.flight_tracker_api.Models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Forum")

public class Forum {
    // define a field for the forum id
    @Id
    private long id;
    // define a field for the forum content
    private String content;
    // owner field to be implemented later with authentication
//    private User owner;
    // define fields for comments and likes. These should hold arrays
//    private List<CommentModel> comments;
//    private List<LikeModel> likes;

}
