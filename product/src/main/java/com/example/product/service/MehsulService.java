package com.example.product.service;

import com.example.product.entity.Mehsul;
import com.example.product.repository.MehsulRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class MehsulService {
    private final MehsulRepository mehsulRepository;
    public MehsulService(MehsulRepository mehsulRepository) {
        this.mehsulRepository = mehsulRepository;
    }
    public List<Mehsul> getAllMehsul(){
        return mehsulRepository.findAll();
}
    public Mehsul getMehsulById(Long id){
        return mehsulRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Mehsul yoxdur: " + id));
    }
    public Mehsul createMehsul(Mehsul mehsul){
        return mehsulRepository.save(mehsul);
    }
    public void deleteMehsul(Long id){
        mehsulRepository.deleteById(id);
    }
    public Mehsul updateMehsul(Long id, Mehsul mehsulDetails){
        Mehsul mehsul = getMehsulById(id);
        mehsul.setName(mehsulDetails.getName());
        mehsul.setCostPrice(mehsulDetails.getCostPrice());
        mehsul.setProductionDate(mehsulDetails.getProductionDate());
        mehsul.setLastUseDate(mehsulDetails.getLastUseDate());
        mehsul.setSellingPrice(mehsulDetails.getSellingPrice());
        return mehsulRepository.save(mehsul);
    }
    public List<Mehsul> findBySellingPriceBetween(Long min, Long max){
        return mehsulRepository.findBySellingPriceBetween(min, max);
    }
    public List<Mehsul> findByLastUseDateBefore(){
        return mehsulRepository.findByLastUseDateBefore(LocalDate.now());
    }

}
