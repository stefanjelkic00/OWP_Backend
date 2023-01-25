package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import modelUtils.DeliveryRequest;

@Repository
public interface DeliveryRequestRepository extends JpaRepository<DeliveryRequest, Integer>{

	


}
