package com.dzmitrybeinia.reddit.repository;

import com.dzmitrybeinia.reddit.model.AppUser;
import com.dzmitrybeinia.reddit.model.Post;
import com.dzmitrybeinia.reddit.model.Subreddit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(AppUser appUser);
}