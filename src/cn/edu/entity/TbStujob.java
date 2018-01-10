package cn.edu.entity;

/**
 * TbStujob entity. @author MyEclipse Persistence Tools
 */

public class TbStujob implements java.io.Serializable {

	// Fields

	private TbStujobId id;

	// Constructors

	/** default constructor */
	public TbStujob() {
	}

	/** full constructor */
	public TbStujob(TbStujobId id) {
		this.id = id;
	}

	// Property accessors

	public TbStujobId getId() {
		return this.id;
	}

	public void setId(TbStujobId id) {
		this.id = id;
	}

}