package com.sticker.operasticker.services;

import com.sticker.operasticker.repositories.OperaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OperaService {

    @Autowired
    private OperaRepo operaRepo;

    public void deleteOpera(int id) {
        operaRepo.deleteById(id);
    }
}
