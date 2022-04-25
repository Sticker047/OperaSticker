package com.sticker.operasticker.services;

import com.sticker.operasticker.repositories.TheatreRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TheatreService {

    @Autowired
    private TheatreRepo theatreRepo;


}
