/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zetcode.SpringBootRestController.service;

/**
 *
 * @author Safarifone
 */
import com.zetcode.SpringBootRestController.bean.City;
import java.util.List;

public interface ICityService {

    public List<City> findAll();
}