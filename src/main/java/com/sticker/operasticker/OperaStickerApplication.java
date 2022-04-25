package com.sticker.operasticker;

import com.sticker.operasticker.repositories.OperaRepo;
import com.sticker.operasticker.repositories.TheatreRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OperaStickerApplication {

    @Autowired
    private TheatreRepo theatreRepo;

    @Autowired
    private OperaRepo operaRepo;

    public static void main(String[] args) {
        SpringApplication.run(OperaStickerApplication.class, args);

        Program program = new Program();
        program.start();
    }

}
