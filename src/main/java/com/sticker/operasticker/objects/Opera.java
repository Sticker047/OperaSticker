package com.sticker.operasticker.objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Opera {

    private int id;

    private String name;
    private String definition;
    private int ageCategory;

}
