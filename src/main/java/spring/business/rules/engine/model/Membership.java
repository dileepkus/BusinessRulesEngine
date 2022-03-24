package spring.business.rules.engine.model;

public class Membership {

	//membership - activate membership, upgrade membership
	
	private String activateMembership;
	
	private String upgradeMembership;

	public String getActivateMembership() {
		return activateMembership;
	}

	public void setActivateMembership(String activateMembership) {
		this.activateMembership = activateMembership;
	}

	public String getUpgradeMembership() {
		return upgradeMembership;
	}

	public void setUpgradeMembership(String upgradeMembership) {
		this.upgradeMembership = upgradeMembership;
	}
	
}
