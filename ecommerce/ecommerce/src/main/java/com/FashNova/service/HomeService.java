package com.FashNova.service;

import com.FashNova.model.Home;
import com.FashNova.model.HomeCategory;

import java.util.List;

public interface HomeService {

    Home creatHomePageData(List<HomeCategory> categories);

}
