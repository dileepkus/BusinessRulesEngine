package spring.business.rules.engine;

public class Payment {

	private String type;
	
	private String action;
	
	private String generateAgentCommission;
	
	Membership membership;
	
	Product product;

/*order - payment, product
payment - generate agent commission payment, 
product -  type,     physical product, book , video- “Learning to Ski" 
membership - activate membership, upgrade membership
*/	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getGenerateAgentCommission() {
		return generateAgentCommission;
	}

	public void setGenerateAgentCommission(String generateAgentCommission) {
		this.generateAgentCommission = generateAgentCommission;
	}
	
}
