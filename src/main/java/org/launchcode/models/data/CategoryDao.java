package org.launchcode.models.data;

import org.launchcode.models.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by Nick Martellaro on 4/9/2017.
 */

@Repository
@Transactional
public interface CategoryDao extends CrudRepository<Category, Integer> {
}
