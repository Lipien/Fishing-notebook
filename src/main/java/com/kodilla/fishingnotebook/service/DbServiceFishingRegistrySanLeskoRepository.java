package com.kodilla.fishingnotebook.service;

import com.kodilla.fishingnotebook.domain.registry.SanLeskoRegistry;
import com.kodilla.fishingnotebook.repository.registryRepositories.RegistrySanLeskoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class DbServiceFishingRegistrySanLeskoRepository {

    @Autowired
    private RegistrySanLeskoRepository registrySanLeskoRepository;

    public List <SanLeskoRegistry> getAllFish() {
        return registrySanLeskoRepository.findAll();
    }

    public SanLeskoRegistry saveFish(final SanLeskoRegistry sanLeskoRegistry) {
        return registrySanLeskoRepository.save(sanLeskoRegistry);
    }
}



