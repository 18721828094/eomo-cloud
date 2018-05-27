package com.prato.cloud.service.impl;

import com.prato.cloud.entity.Relationship;
import com.prato.cloud.entity.User;
import com.prato.cloud.repository.RelationshipRepository;
import com.prato.cloud.repository.UserRepository;
import com.prato.cloud.service.RelationshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service("relationshipService")
public class RelationshipServiceImpl implements RelationshipService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RelationshipRepository relationshipRepository;

    @Override
    public Page<User> listFollows(Long userId, Pageable pageable) {
        List<Integer> relationshipList = relationshipRepository.findByFromUserId(userId);
        Page<User> userPage = userRepository.findByIdIn(relationshipList, pageable);
        return userPage;
    }

    @Override
    public Page<User> listFans(Long userId, Pageable pageable) {
        List<Integer> relationshipList = relationshipRepository.findByToUserId(userId);
        Page<User> userPage = userRepository.findByIdIn(relationshipList, pageable);
        return userPage;
    }

    @Override
    public List<Long> listFriends(Long userId) {
        List<Integer> relationshipList = relationshipRepository.findFriendsByUserId(userId);
        return relationshipList;
    }

    @Override
    public void saveRelationship(Relationship relationship) {

    }

    @Override
    public void removeRelationship(Relationship relationship) {

    }

    @Override
    public void updateFollowSize(Long userId) {

    }

    @Override
    public void updateFanSize(Long userId) {

    }
}
