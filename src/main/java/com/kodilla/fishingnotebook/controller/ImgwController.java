package com.kodilla.fishingnotebook.controller;

import com.kodilla.fishingnotebook.client.ImgwClient;
import com.kodilla.fishingnotebook.domain.ImgwDto;
import com.kodilla.fishingnotebook.mapper.ImgwMapper;
import com.kodilla.fishingnotebook.service.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/hydro")
public class ImgwController {

    @Autowired
    private ImgwClient imgwClient;

    @Autowired
    private ImgwMapper imgwMapper;

    @Autowired
    private DbService dbService;

    @GetMapping(value = "getHydro")
    public void getHydro() {

        List <ImgwDto> hydroData = imgwClient.getImgwStations();

        dbService.saveImgwStations(imgwMapper.mapToImgwList(hydroData));

       /* hydroData.forEach(imgwDto ->
                System.out.println(imgwDto.getRzeka() + " " + imgwDto.getStanWody()));*/
    }
}
