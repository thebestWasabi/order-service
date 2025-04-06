package ru.javaops.cloudjava.ordersservice.storage.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import ru.javaops.cloudjava.ordersservice.storage.model.MenuOrder;

@Repository
public interface MenuOrderRepository extends ReactiveCrudRepository<MenuOrder, Long> {
    Flux<MenuOrder> findAll(String username, Pageable pageable);
}
