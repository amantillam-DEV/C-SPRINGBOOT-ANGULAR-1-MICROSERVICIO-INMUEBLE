package com.vaxi.springbootmicroservice1inmueblev2.repository;

import com.vaxi.springbootmicroservice1inmueblev2.model.Inmueble;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InmuebleRepository  extends JpaRepository<Inmueble, Long> {
}
