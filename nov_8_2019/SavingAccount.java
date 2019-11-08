package nov_8_2019;

import com.xyz.overriding.demo.Account;
//import com.xyz.overriding.demo1.Account;

public class SavingAccount extends Account {

	@Override
	public void show() {
		System.out.println("Show of Class SavingAccount");
	}
}
