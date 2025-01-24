package com.dailycodework.dream.repository;

import com.dailycodework.dream.model.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BaseRepository<T> extends JpaRepository<T extends BaseEntity, Long> {
}
