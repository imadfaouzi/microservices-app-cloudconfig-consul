package ma.imadfaouzi.orderservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ma.imadfaouzi.orderservice.entities.Order;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface OrderRepository extends JpaRepository<Order, Long> {
}
