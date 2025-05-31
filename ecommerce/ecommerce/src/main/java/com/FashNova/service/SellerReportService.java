package com.FashNova.service;

import com.FashNova.model.Seller;
import com.FashNova.model.SellerReport;

public interface SellerReportService {
    SellerReport getSellerReport(Seller seller);
    SellerReport updateSellerReport( SellerReport sellerReport);

}
