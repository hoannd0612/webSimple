package hoannd.websimple.repository;

import hoannd.websimple.entity.NewEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface NewRepository extends JpaRepository<NewEntity,Long> {
}
