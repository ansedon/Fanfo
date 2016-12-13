package hibernate;
// Generated 2016-12-13 10:58:38 by Hibernate Tools 3.2.2.GA

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * RouTrade generated by hbm2java
 */
@Entity
@Table(name = "rou_trade", catalog = "db_15")
public class RouTrade implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private RouTradeId id;
	private User user;
	private Route route;
	private Date rouTradeTime;
	private Character rouTradeStatus;
	private String rouComment;

	public RouTrade() {
	}

	public RouTrade(RouTradeId id, User user, Route route) {
		this.id = id;
		this.user = user;
		this.route = route;
	}

	public RouTrade(RouTradeId id, User user, Route route, Date rouTradeTime, Character rouTradeStatus,
			String rouComment) {
		this.id = id;
		this.user = user;
		this.route = route;
		this.rouTradeTime = rouTradeTime;
		this.rouTradeStatus = rouTradeStatus;
		this.rouComment = rouComment;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "tradeUserId", column = @Column(name = "trade_user_id", nullable = false) ),
			@AttributeOverride(name = "tradeRouId", column = @Column(name = "trade_rou_id", nullable = false) ) })
	public RouTradeId getId() {
		return this.id;
	}

	public void setId(RouTradeId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "trade_user_id", nullable = false, insertable = false, updatable = false)
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "trade_rou_id", nullable = false, insertable = false, updatable = false)
	public Route getRoute() {
		return this.route;
	}

	public void setRoute(Route route) {
		this.route = route;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "rou_trade_time", length = 10)
	public Date getRouTradeTime() {
		return this.rouTradeTime;
	}

	public void setRouTradeTime(Date rouTradeTime) {
		this.rouTradeTime = rouTradeTime;
	}

	@Column(name = "rou_trade_status", length = 1)
	public Character getRouTradeStatus() {
		return this.rouTradeStatus;
	}

	public void setRouTradeStatus(Character rouTradeStatus) {
		this.rouTradeStatus = rouTradeStatus;
	}

	@Column(name = "rou_comment", length = 200)
	public String getRouComment() {
		return this.rouComment;
	}

	public void setRouComment(String rouComment) {
		this.rouComment = rouComment;
	}

}