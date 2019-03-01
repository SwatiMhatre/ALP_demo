package org.payment.cache;

import org.payment.debitsc.dto.CreditAccount;
import org.payment.debitsc.repository.CreditAccountRepository;
import org.payment.debitsc.repository.DebitAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {
	
	@Autowired
	private CreditAccountRepository creditAccountRepository;
	@Autowired
	private DebitAccountRepository debitAccountRepository;
	
	public DataInitializer() {
		super();
	}

	public void fillWithTestdata(){
		/*insert into debit_account(id,account_number,account_type,current_balance)
		values(1,7330000245,'Salary Account',60005);
		insert into debit_account(id,account_number,account_type,current_balance)
		values(2,7330000246,'Savings Account',7500);
		insert into debit_account(id,account_number,account_type,current_balance)
		values(3,7330000247,'Credit Account',150000);

		insert into credit_account(id,account_number,beneficiary_name)
		values(1,7230000245,'Swati');
		insert into credit_account(id,account_number,beneficiary_name)
		values(2,7230000246,'Manwinder');
		insert into credit_account(id,account_number,beneficiary_name)
		values(3,7230000247,'Gaurav');*/
		
		CreditAccount cA1 = new CreditAccount();
		cA1.setAccountNumber(7230000245L);
		cA1.setAccountType("Swati");
		CreditAccount cA2 = new CreditAccount();
		cA2.setAccountNumber(7230000246L);
		cA2.setAccountType("Manwinder");
		CreditAccount cA3 = new CreditAccount();
		cA2.setAccountNumber(7230000247L);
		cA2.setAccountType("Gaurav");
		
		creditAccountRepository.save(cA1);
		creditAccountRepository.save(cA2);
		creditAccountRepository.save(cA3);
		
	}
}
