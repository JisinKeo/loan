package com.project.loan.repository;

import com.project.loan.domain.Repayment;
import com.project.loan.dto.RepaymentDTO.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepaymentRepository extends JpaRepository<Repayment, Long> {

    List<Repayment> findAllByApplicationId(Long applicationId);

}
