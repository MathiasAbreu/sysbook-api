package br.com.ufcg.sysbook.repositorys;

import br.com.ufcg.sysbook.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
    
}
