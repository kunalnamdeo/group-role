package com.openapi.group.service;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * User
 */

@Entity
@Table(name = "ARMAGroups")
public class ARMAUser {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "loginName")
	private String loginName;

	@Column(name = "userNumber")
	private String userNumber;

	@Column(name = "fullName")
	private String fullName;

	@Column(name = "kulanzId")
	private Integer kulanzId;

	@Column(name = "maximumApprovalAmount")
	private Integer maximumApprovalAmount;

	@Column(name = "maximumPaymentAmount")
	private Integer maximumPaymentAmount;

	@Column(name = "verificatorLoginName")
	private String verificatorLoginName;

	@Column(name = "verificatorUserNumber")
	private String verificatorUserNumber;

	@Column(name = "archiveAcceptedOn")
	private String archiveAcceptedOn;

	@Column(name = "archivingEnabled")
	private Boolean archivingEnabled;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public ARMAUser userNumber(String userNumber) {
		this.userNumber = userNumber;
		return this;
	}

	public String getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Integer getKulanzId() {
		return kulanzId;
	}

	public void setKulanzId(Integer kulanzId) {
		this.kulanzId = kulanzId;
	}

	public Integer getMaximumApprovalAmount() {
		return maximumApprovalAmount;
	}

	public void setMaximumApprovalAmount(Integer maximumApprovalAmount) {
		this.maximumApprovalAmount = maximumApprovalAmount;
	}

	public Integer getMaximumPaymentAmount() {
		return maximumPaymentAmount;
	}

	public void setMaximumPaymentAmount(Integer maximumPaymentAmount) {
		this.maximumPaymentAmount = maximumPaymentAmount;
	}

	public String getVerificatorLoginName() {
		return verificatorLoginName;
	}

	public void setVerificatorLoginName(String verificatorLoginName) {
		this.verificatorLoginName = verificatorLoginName;
	}

	public ARMAUser verificatorUserNumber(String verificatorUserNumber) {
		this.verificatorUserNumber = verificatorUserNumber;
		return this;
	}

	public String getVerificatorUserNumber() {
		return verificatorUserNumber;
	}

	public void setVerificatorUserNumber(String verificatorUserNumber) {
		this.verificatorUserNumber = verificatorUserNumber;
	}

	public String getArchiveAcceptedOn() {
		return archiveAcceptedOn;
	}

	public void setArchiveAcceptedOn(String archiveAcceptedOn) {
		this.archiveAcceptedOn = archiveAcceptedOn;
	}

	public Boolean getArchivingEnabled() {
		return archivingEnabled;
	}

	public void setArchivingEnabled(Boolean archivingEnabled) {
		this.archivingEnabled = archivingEnabled;
	}

}
