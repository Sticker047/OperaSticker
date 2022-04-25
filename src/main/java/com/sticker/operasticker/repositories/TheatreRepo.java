package com.sticker.operasticker.repositories;

import com.sticker.operasticker.entities.TheatreEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TheatreRepo extends CrudRepository<TheatreEntity, Integer> {
}
