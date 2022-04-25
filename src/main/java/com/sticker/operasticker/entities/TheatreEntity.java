package com.sticker.operasticker.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.*;

@Entity
@NoArgsConstructor
@Data
public class TheatreEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int theatre_id;
    private String theatreName;

    @OneToMany(cascade = CascadeType.ALL
            //, mappedBy = "theatre"
    )
    private List<OperaEntity> operas;
}
