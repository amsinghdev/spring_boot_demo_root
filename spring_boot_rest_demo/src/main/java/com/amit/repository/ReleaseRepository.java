package com.amit.repository;

import com.amit.entity.Release;
import org.springframework.data.repository.CrudRepository;

public interface ReleaseRepository extends CrudRepository<Release,Long> {
}
