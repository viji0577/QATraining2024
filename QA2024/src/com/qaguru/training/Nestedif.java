package com.qaguru.training;

public class Nestedif {

	public static void main(String[] args) {
	
		boolean eligibility = false;
		String result = null;
		
		Nestedif nif = new Nestedif();
		// return type boolean
		eligibility = nif.CheckVotingElibility(16,  true);
		System.out.println("The person is eligible to vote " +  eligibility);
		eligibility = nif.CheckVotingElibility(21,  true);
		System.out.println("The person is eligible to vote " +  eligibility);
		eligibility = nif.CheckVotingElibility(23,  true);
		System.out.println("The person is eligible to vote " +  eligibility);
		eligibility = nif.CheckVotingElibility(23,  false);
		System.out.println("The person is eligible to vote " +  eligibility);
		eligibility = nif.CheckVotingElibility(24,  true);
		System.out.println("The person is eligible to vote " +  eligibility);
		
		// return type string
		result = nif.CheckVotingElibilityStr(16, true);
		System.out.println("The person is eligible to vote " +  result);
		result = nif.CheckVotingElibilityStr(21,  true);
		System.out.println("The person is eligible to vote " +  result);
		result = nif.CheckVotingElibilityStr(23,  true);
		System.out.println("The person is eligible to vote " +  result);
		result = nif.CheckVotingElibilityStr(23,  false);
		System.out.println("The person is eligible to vote " +  result);
		result = nif.CheckVotingElibilityStr(24,  true);
		System.out.println("The person is eligible to vote " +  result);	
		
		// Return type string using static method
		result = CheckVotingElibilityStrStatic(16, true);
		System.out.println("The person is eligible to vote " +  result);
		result = CheckVotingElibilityStrStatic(21,  true);
		System.out.println("The person is eligible to vote " +  result);
		result = CheckVotingElibilityStrStatic(23,  true);
		System.out.println("The person is eligible to vote " +  result);
		result = CheckVotingElibilityStrStatic(23,  false);
		System.out.println("The person is eligible to vote " +  result);
		result = CheckVotingElibilityStrStatic(24,  true);
		System.out.println("The person is eligible to vote " +  result);	
		
		
		
	}

	// Non Static method returning boolean result
	public boolean CheckVotingElibility(int age , boolean isCitizen) {
              
                if (age >= 21) {
                	if (isCitizen == true) {
                		return true;
                	}
                	else {
                		return false;
                	}
                } else {
                	return false;
                }
	}

	// Non Static method returning string result
	public String CheckVotingElibilityStr(int age , boolean isCitizen) {
        
        if (age >= 21) {
        	if (isCitizen == true) {
        		return "Eligible";
        	}
        	else {
        		return "Not Eligible";
        	}
        } else {
        	return "Not Eligible";
        }
	}
	
	// static Method returning  string result
public static String CheckVotingElibilityStrStatic(int age , boolean isCitizen) {
        
        if (age >= 21) {
        	if (isCitizen == true) {
        		return "Eligible";
        	}
        	else {
        		return "Not Eligible";
        	}
        } else {
        	return "Not Eligible";
        }
	}
	

}
