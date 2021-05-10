package com.example.emipractical.service;

import com.example.emipractical.model.Emi;

import java.util.List;

public interface EmiService {
    List<Emi> getEmiByCust(int cust_id);
    boolean saveEmi(Emi emi);
    boolean updateEmi(Emi emi);

}
