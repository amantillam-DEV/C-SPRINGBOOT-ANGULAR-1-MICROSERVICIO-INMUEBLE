package com.vaxi.springbootmicroservice1inmueblev2.service;

import com.vaxi.springbootmicroservice1inmueblev2.model.Inmueble;

import java.util.List;

public interface InmuebleService {
    Inmueble saveInmueble(Inmueble inmueble);

    void deleteInmueble(Long inmuebleId);

    List<Inmueble> findAllInmuebles();
}
