package com.example.car_maintanance_tracker.users.repository;

import com.example.car_maintanance_tracker.users.repository.entity.UserEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends PagingAndSortingRepository<UserEntity, Long> {

}
