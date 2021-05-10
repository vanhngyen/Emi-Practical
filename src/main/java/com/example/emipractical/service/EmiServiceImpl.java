package com.example.emipractical.service;

import com.example.emipractical.model.Emi;
import com.example.emipractical.repository.EmiRepository;
import com.example.emipractical.service.EmiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class EmiServiceImpl implements EmiService {
    @Autowired
    private EmiRepository emiRepository;

    @Override
    public List<Emi> getEmiByCust(int cust_id) {
        try{
            List<Emi> list = emiRepository.getEmiByCust(cust_id);
            return list;
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean saveEmi(Emi emi) {
        try{
            emi.setCreated(new Date());
            emi.setUpdated(new Date());
            emiRepository.save(emi);
            return true;
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateEmi(Emi emi) {
        try{
            emi.setUpdated(new Date());
            emiRepository.save(emi);

        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }
}
