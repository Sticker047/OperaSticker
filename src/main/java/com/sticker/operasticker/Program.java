package com.sticker.operasticker;

import com.sticker.operasticker.entities.TheatreEntity;
import com.sticker.operasticker.repositories.TheatreRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class Program {

    @Autowired
    private TheatreRepo theatreRepo;

    public void start() {
        TheatreEntity theatreEntity = new TheatreEntity();
        System.out.println(theatreEntity.getTheatre_id());
        theatreEntity.setTheatreName("Театр");
        System.out.println(theatreEntity.getTheatreName());
        try {
            theatreRepo.save(theatreEntity);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
