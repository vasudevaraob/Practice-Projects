package in.vasudev;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class Agent {
	
	@Id
	private int aId;
	private AgentName aName;
	private int aSalary;
	private String dept;

	public int getaId() {
		return aId;
	}

	public void setaId(int aId) {
		this.aId = aId;
	}

	public AgentName getaName() {
		return aName;
	}

	public void setaName(AgentName aName) {
		this.aName = aName;
	}

	public int getaSalary() {
		return aSalary;
	}

	public void setaSalary(int aSalary) {
		this.aSalary = aSalary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Agent [aId=" + aId + ", aName=" + aName + ", aSalary=" + aSalary + ", dept=" + dept + "]";
	}

}
