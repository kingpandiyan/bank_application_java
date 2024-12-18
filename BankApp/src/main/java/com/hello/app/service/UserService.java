package com.hello.app.service;
import com.hello.app.entity.User;
import com.hello.app.repository.UserRepository;
import java.util.List;
import java.util.Map;


public class UserService{
	
	private UserRepository userRepository = new UserRepository();
	
	public void printUsers(){
		userRepository.printUsers();
	}
	public User login(String username, String password){
		return userRepository.login(username, password);
	}

	public boolean addNewCostomer(String username, String password, String contact){
		return userRepository.addNewCostomer(username, password, contact);
	}

	public Double checkBankBalance(String userId){
		return userRepository.checkBankBalance(userId);
	}

	public User getUser(String useId){
		return userRepository.getUser(useId);
	}

	public boolean transferAmount(String userId, String payeeUserId, Double amount){
		return userRepository.transferAmount(userId, payeeUserId, amount);
	}

	public void printTransaction(String userId){
		userRepository.printTransaction(userId);
	}

	public void raiseChequeBookRequest(String userId){
		userRepository.raiseChequeBookRequest(userId);
	}

	public Map<String, Boolean> getAllChequeBookRequest(){
		return userRepository.getAllChequeBookRequest();
	}

	public List<String> getUserIdForChequeBookRequest(){
		return userRepository.getUserIdForChequeBookRequest();
	}

	public void approveChequeBookRequest(String userId){
		userRepository.approveChequeBookRequest(userId);
	}

}