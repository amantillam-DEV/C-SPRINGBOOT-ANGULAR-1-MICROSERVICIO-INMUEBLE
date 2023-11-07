package com.vaxi.springbootmicroservice1inmueblev2.service;

import com.vaxi.springbootmicroservice1inmueblev2.model.Inmueble;
import com.vaxi.springbootmicroservice1inmueblev2.repository.InmuebleRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class InmuebleServiceImpl  implements InmuebleService{

    private final InmuebleRepository inmuebleRepository;

    public InmuebleServiceImpl(InmuebleRepository inmuebleRepository) {
        this.inmuebleRepository = inmuebleRepository;
    }
    @Override
    public Inmueble saveInmueble(Inmueble inmueble){
        inmueble.setFechaCreacion(LocalDateTime.now());
        return inmuebleRepository.save(inmueble);
    }

    @Override
    public void deleteInmueble(Long inmuebleId){
        inmuebleRepository.deleteById(inmuebleId);
    }
    @Override
    public List<Inmueble> findAllInmuebles(){
        return inmuebleRepository.findAll();
    }
}
