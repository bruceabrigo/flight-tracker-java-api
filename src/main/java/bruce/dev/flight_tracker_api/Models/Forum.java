package bruce.dev.flight_tracker_api.Models;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "Forums")

public class Forum {
    // define a field for the forum id
    @Id
    private long id;
    // define a field for the forum content
    private String content;
    // owner field to be implemented later with authentication
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id", nullable = false)
    private User owner;
    // define fields for comments and likes. These should hold arrays
//    private List<CommentModel> comments;
//    private List<LikeModel> likes;
    // CreatedAt field
    private Date createdAt;

    @PrePersist
    protected void onCreate() {
        createdAt = new Date();
    }
}
