package com.kodilla.fishingnotebook.repository.registryRepositories;

import com.kodilla.fishingnotebook.domain.registry.SanLeskoRegistry;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface RegistrySanLeskoRepository extends CrudRepository <SanLeskoRegistry, Long> {

    @Override
    List <SanLeskoRegistry> findAll();
}
