package com.etiyacrm.customerservice.repositories;

import com.etiyacrm.customerservice.entities.IndividualCustomer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface IndividualCustomerRepository extends JpaRepository<IndividualCustomer,Long> {

    Optional<IndividualCustomer> findByNationalityIdentityIgnoreCase(String nationalityIdentity);
    List<IndividualCustomer> findByDeletedDate(LocalDateTime deletedDate);
    Page<IndividualCustomer> findByDeletedDateIsNull(Pageable pageable);
}
