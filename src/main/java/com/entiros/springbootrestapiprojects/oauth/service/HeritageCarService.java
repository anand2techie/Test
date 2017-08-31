package com.entiros.springbootrestapiprojects.oauth.service;


import java.awt.Image;
import java.awt.image.BufferedImage;

import com.entiros.springbootrestapiprojects.oauth.model.HeritageCar;


public interface HeritageCarService  {


    Iterable<HeritageCar> listAllHeritageCars();

    HeritageCar getHeritageCarById(String id);

    HeritageCar saveHeritageCar(HeritageCar heritageCar);

    /*HeritageCar saveHeritageCarbyId(HeritageCar heritageCarId);*/

    void deleteHeritageCarById(String heritageCarId);
    
    BufferedImage getHeritageCarImageById(String id);

}