package employeeimplementation;

public class InsuranceInfo {

	private String policyName;
	private String policyId;


	public String getPolicyName() {
		return policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}

	public String getPolicyId() {
		return policyId;
	}

	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}

	@Override
	public String toString() {
		return "InsuranceInfo [policyName=" + policyName + ", policyId=" + policyId + "]";
	}

}
