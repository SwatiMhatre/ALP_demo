package org.payment.debitsc.repository;

import java.util.List;

import org.payment.debitsc.dto.CreditAccount;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface CreditAccountRepository extends CrudRepository<CreditAccount, Integer> {
	CreditAccount getCreditAcById(Integer id);

}
