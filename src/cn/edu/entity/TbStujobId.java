package cn.edu.entity;

/**
 * TbStujobId entity. @author MyEclipse Persistence Tools
 */

public class TbStujobId implements java.io.Serializable {

	// Fields

	private TbStudent tbStudent;
	private TbJob tbJob;

	// Constructors

	/** default constructor */
	public TbStujobId() {
	}

	/** full constructor */
	public TbStujobId(TbStudent tbStudent, TbJob tbJob) {
		this.tbStudent = tbStudent;
		this.tbJob = tbJob;
	}

	// Property accessors

	public TbStudent getTbStudent() {
		return this.tbStudent;
	}

	public void setTbStudent(TbStudent tbStudent) {
		this.tbStudent = tbStudent;
	}

	public TbJob getTbJob() {
		return this.tbJob;
	}

	public void setTbJob(TbJob tbJob) {
		this.tbJob = tbJob;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TbStujobId))
			return false;
		TbStujobId castOther = (TbStujobId) other;

		return ((this.getTbStudent() == castOther.getTbStudent()) || (this
				.getTbStudent() != null && castOther.getTbStudent() != null && this
				.getTbStudent().equals(castOther.getTbStudent())))
				&& ((this.getTbJob() == castOther.getTbJob()) || (this
						.getTbJob() != null && castOther.getTbJob() != null && this
						.getTbJob().equals(castOther.getTbJob())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getTbStudent() == null ? 0 : this.getTbStudent().hashCode());
		result = 37 * result
				+ (getTbJob() == null ? 0 : this.getTbJob().hashCode());
		return result;
	}

}