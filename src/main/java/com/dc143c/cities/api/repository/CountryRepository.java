package com.dc143c.cities.api.repository;

import com.dc143c.cities.api.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
