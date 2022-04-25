package com.sticker.operasticker.repositories;

import com.sticker.operasticker.entities.OperaEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperaRepo extends CrudRepository<OperaEntity, Integer> {
}
