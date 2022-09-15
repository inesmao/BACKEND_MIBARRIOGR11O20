package co.edu.uis.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Sort;
import co.edu.uis.model.Product;
import co.edu.uis.model.User;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	public List<Product> findByUser(User user, Sort sort);

	public Product findByUserAndId(User user, Integer id);
}