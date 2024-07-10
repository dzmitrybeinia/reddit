package com.dzmitrybeinia.reddit.repository;

import com.dzmitrybeinia.reddit.model.AppUser;
import com.dzmitrybeinia.reddit.model.Comment;
import com.dzmitrybeinia.reddit.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(AppUser user);
}