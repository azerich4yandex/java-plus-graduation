package ru.practicum.comment.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.practicum.comment.model.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> getCommentsByAuthorId(Long userId);

    @Query("SELECT c FROM Comment c WHERE c.event.id = ?1 ORDER BY c.id LIMIT ?3 OFFSET ?2")
    List<Comment> findAllCommentsForEvent(Long eventId, Integer from, Integer size);

}