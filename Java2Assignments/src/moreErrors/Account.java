package moreErrors;

/****************************************************************************************
 * @Class: CIST 2372 Java 2 															*
 * @Term: Fall 2014 																	*
 * @Lab:  4																				*
 * @author: William M. Driver 															*
 * @date: 09/09/2014 																	*
 * @Description: Error Handling 														*
 * 		part 2																			* 
 * 		get/set Balance, Account Number, Owner  										*
 * 		implement custom exception														*
 *  																					*
 * @version: 1.0 																		* 
 * @update: 																			*
 ****************************************************************************************/

import java.text.DecimalFormat;

public class Account {
	//Declarations
	
	private double balance;
	private int acctNo;
	private String owner;
		
	public Account(){
			
	} // end default constructor 
	
	public Account(int acctNo, String owner, double balance){
			this.balance = balance;
			this.acctNo = acctNo;
			this.owner = owner;
	} // end default constructor
	
	private void getBalance(){
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println(df.format(balance));
	} // end getBalance
	
	private double setBalance(double balance){
		this.balance = balance;
		return balance;
	} // end setBalance
	
	private void getAcctNo(){
		System.out.println(acctNo);
	} // end getAcctNo
	
	private int setAcctNo(int acctNo){
		this.acctNo = acctNo;
		return acctNo;
	} // end setAcctNo
	
	private void getOwner(){
		System.out.println(owner);
	} // end getOwner
	
	private String setOwner(String owner){
		this.owner = owner;
		return owner;
	} // end setOwner
	
	private void display(){
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("Account: " + acctNo);
		System.out.println("Owner: \t " + owner);
		System.out.println("Balance: " + df.format(balance) + "\n\n");
	} // end display
	
	private void deposit(double bills){
		this.balance = bills + balance;
	} // end deposit
	
	private void withdraw(double bills) throws NegBalance{
		if(bills > balance ){
			throw new NegBalance();
		}
		this.balance = balance - bills;
	} // end withdraw
	
	public static void main(String[] args) {
		Account a1;
		a1 = new Account(2222, "Frank", 1000);
		
		try{
		a1.display();
		a1.deposit(100.00);
		a1.display();
		a1.withdraw(400);
		a1.display();
//		a1.withdraw(10000);	
		a1.display();
		}catch (NegBalance x){
			System.out.println(x);
		}
		
		a1.getOwner();
		a1.getBalance();
		a1.getAcctNo();
		
		a1.setAcctNo(3333);
		a1.setBalance(100000);
		a1.setOwner("Molly");
		
		a1.getOwner();
		a1.getBalance();
		a1.getAcctNo();
		
	} // end main

} // end class
