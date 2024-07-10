package com.dzmitrybeinia.reddit.repository;

import com.dzmitrybeinia.reddit.model.AppUser;
import com.dzmitrybeinia.reddit.model.Post;
import com.dzmitrybeinia.reddit.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, AppUser currentUser);
}