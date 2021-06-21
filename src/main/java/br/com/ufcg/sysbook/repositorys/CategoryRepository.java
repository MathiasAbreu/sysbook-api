package br.com.ufcg.sysbook.repositorys;

import br.com.ufcg.sysbook.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
