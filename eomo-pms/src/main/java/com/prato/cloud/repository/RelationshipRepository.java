package com.prato.cloud.repository;

import com.prato.cloud.entity.Relationship;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RelationshipRepository extends JpaRepository<Relationship, Long> {
    List<Integer> findByFromUserId(Long userId);

    List<Integer> findByToUserId(Long userId);

    List<Integer> findFriendsByUserId(Long userId);
}
