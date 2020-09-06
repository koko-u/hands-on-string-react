package jp.co.kokou.example.cardatabase.repository;

import jp.co.kokou.example.cardatabase.domain.Owner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
