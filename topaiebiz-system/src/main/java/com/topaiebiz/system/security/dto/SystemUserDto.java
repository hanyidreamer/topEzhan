package com.topaiebiz.system.security.dto;

import java.util.Date;
//import java.util.List;

import javax.validation.constraints.NotNull;

/**
 * 描述：系统用户信息传输实体。
 * 
 * @author Created by Amir Wang on 2017年10月30日。
 * 
 * @since 1.1.2
 */
public class SystemUserDto {
	
	/** 登录类型。*/
	@NotNull(message = "{nebula.system.security.systemUserDto.type.notNull}")
	private String type;

	/** 系统用户名称。可用作登录的账户名（即使用用户名登录）。 */
	@NotNull(message = "{nebula.system.security.systemUserDto.username.notNull}")
	private String username;

	/** 系统用户的真实名称。一般作为冗余字段回写，以便显示使用。 */
	private String realname;

	/** 系统用户的当前登录密码。 */
	@NotNull(message = "{nebula.system.security.systemUserDto.password.notNull}")
	private String password;

	/** 系统用户的当前登录密码的确认密码（会员型用户注册时再次输入的密码）。 */
	private String confirmPassword;

	/** 系统用户的当前登录密码的有效期。 当前登录密码过期前必须修改密码，过期后只能重置密码。 */
	private Date validityDate;

	/** 系统用户的最近两次历史登录密码（以,分割的MD5加密串）。若是强安全的登录密码管理，要求当前登录密码到期修改时，不能与最近两次的历史登录密码相同。 */
	private String lastTwicePassword;

	/** 系统用户的邮箱。可用作登录的账户名（即使用邮箱登录）。 */
	private String email;

	/** 系统用户的移动电话。可用作登录的账户名（即使用手机号登录） 。 */
	private String mobilePhone;

	/** 系统用户的账户是否是未过期的。即过期状态，true表是未过期的，false表示已过期的。 过期的账户是不能被认证和登录的。 */
	private boolean isAccountNonExpired = true;

	/** 系统用户的账户是否是未锁定的。即锁定状态，true表是未锁定的，false表示已锁定的。 锁定的账户是不能被认证和登录的。 */
	private boolean isAccountNonLocked  = true;

	/** 系统用户的账户的证书是否是过期的。即过期状态，true表是未过期的，false表示已过期的。 过期的证书是不能被认证和登录的。 */
	private boolean isCredentialsNonExpired  = true;

	/**
	 * 系统用户的账户是否是激活（或已启用）的。即激活（或启用）状态，true表是已激活（或启用）的，false表示未激活（或启用）的。
	 * 未激活（或启用）的账户是不能被认证和登录的。
	 */
	private boolean isEnabled = true;

	/**
	 * Description: 获取系统用户的名称。可用作登录的账户名（即使用用户名登录）。
	 *
	 * Author: Amir Wang
	 * 
	 * @return 系统用户的名称。
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Description: 设置系统用户的名称。可用作登录的账户名（即使用用户名登录）。
	 *
	 * Author: Amir Wang
	 * 
	 * @param username
	 *            系统用户的名称。
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * Description: 获取系统用户的真实名称。
	 *
	 * Author: Amir Wang
	 * 
	 * @return 系统用户的真实名称。
	 */
	public String getRealname() {
		return realname;
	}

	/**
	 * Description: 设置系统用户的真实名称。一般作为冗余字段回写，以便显示使用。
	 *
	 * Author: Amir Wang
	 * 
	 * @param realname
	 *            系统用户的真实名称。
	 */
	public void setRealname(String realname) {
		this.realname = realname;
	}

	/**
	 * Description: 获取系统用户的当前登录密码。
	 *
	 * Author: Amir Wang
	 * 
	 * @return 系统用户的当前登录密码。
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Description: 设置系统用户的当前登录密码。
	 *
	 * Author: Amir Wang
	 * 
	 * @param password
	 *            系统用户的当前登录密码。
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Description: 获取系统用户的当前登录密码的确认密码（会员型用户注册时再次输入的密码）。
	 *
	 * Author: Amir Wang
	 * 
	 * @return 获取系统用户的当前登录密码的确认密码。
	 */
	public String getConfirmPassword() {
		return confirmPassword;
	}

	/**
	 * Description: 设置系统用户的当前登录密码的确认密码（会员型用户注册时再次输入的密码）。
	 *
	 * Author: Amir Wang
	 * 
	 * @param confirmPassword
	 *            系统用户的当前登录密码的确认密码。
	 */
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	/**
	 * Description: 获取系统用户的当前登录密码的有效期。 当前登录密码过期前必须修改密码，过期后只能重置密码。
	 *
	 * Author: Amir Wang
	 * 
	 * @return 系统用户的当前登录密码的有效期。
	 */
	public Date getValidityDate() {
		return validityDate;
	}

	/**
	 * Description: 设置系统用户的当前登录密码的有效期。 当前登录密码过期前必须修改密码，过期后只能重置密码。
	 *
	 * Author: Amir Wang
	 * 
	 * @param validityDate
	 *            系统用户的当前登录密码的有效期。
	 */
	public void setValidityDate(Date validityDate) {
		this.validityDate = validityDate;
	}

	/**
	 * Description:
	 * 获取系统用户的最近两次历史登录密码（以,分割的MD5加密串）。若是强安全的登录密码管理，要求当前登录密码到期修改时，不能与最近两次的历史登录密码相同。
	 *
	 * Author: Amir Wang
	 * 
	 * @return 系统用户的最近两次历史登录密码（以,分割的MD5加密串）。
	 */
	public String getLastTwicePassword() {
		return lastTwicePassword;
	}

	/**
	 * Description:
	 * 设置系统用户的最近两次历史登录密码（以,分割的MD5加密串）。若是强安全的登录密码管理，要求当前登录密码到期修改时，不能与最近两次的历史登录密码相同。
	 *
	 * Author: Amir Wang
	 * 
	 * @param lastTwicePassword
	 *            系统用户的最近两次历史登录密码（以,分割的MD5加密串）。
	 */
	public void setLastTwicePassword(String lastTwicePassword) {
		this.lastTwicePassword = lastTwicePassword;
	}

	/**
	 * Description: 获取系统用户的邮箱。可用作登录的账户名（即使用邮箱登录）。
	 *
	 * Author: Amir Wang
	 * 
	 * @return 系统用户的邮箱。
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Description: 设置系统用户的邮箱。可用作登录的账户名（即使用邮箱登录）。
	 *
	 * Author: Amir Wang
	 * 
	 * @param email
	 *            系统用户的邮箱。
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Description: 获取系统用户的移动电话。可用作登录的账户名（即使用手机号登录） 。
	 *
	 * Author: Amir Wang
	 * 
	 * @return 系统用户的移动电话。
	 */
	public String getMobilePhone() {
		return mobilePhone;
	}

	/**
	 * Description: 设置系统用户的移动电话。可用作登录的账户名（即使用手机号登录） 。
	 *
	 * Author: Amir Wang
	 * 
	 * @param mobilePhone
	 *            系统用户的移动电话。
	 */
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	/**
	 * Description: 判断系统用户的账户是否是已过期的，true表是未过期的，false表示是已过期的。 过期的账户是不能被认证和登录的。
	 *
	 * Author: Amir Wang
	 * 
	 * @return 系统用户的账户是否是已过期的判断结果。
	 */
	public boolean isAccountNonExpired() {
		return isAccountNonExpired;
	}

	/**
	 * Description: 设置系统用户的账户的过期状态，设置为true表示是未过期的，设置为false表示是已过期的。 过期的账户是不能被认证和登录的。
	 *
	 * Author: Amir Wang
	 * 
	 * @param isAccountNonExpired 系统用户的账户的过期状态。
	 */
	public void setAccountNonExpired(boolean isAccountNonExpired) {
		this.isAccountNonExpired = isAccountNonExpired;
	}

	/**
	 * Description: 判断系统用户的账户是否是已锁定的，true表是未锁定的，false表示是已锁定的。 锁定的账户是不能被认证和登录的。
	 *
	 * Author: Amir Wang
	 * 
	 * @return 系统用户的账户是否是已锁定的判断结果。
	 */
	public boolean isAccountNonLocked() {
		return isAccountNonLocked;
	}

	/**
	 * Description: 设置系统用户的账户的锁定状态，设置为true表示是未锁定的，设置为false表示是已锁定的。 已锁定的账户是不能被认证和登录的。
	 *
	 * Author: Amir Wang
	 * 
	 * @param isAccountNonLocked 系统用户的账户的锁定状态。
	 */
	public void setAccountNonLocked(boolean isAccountNonLocked) {
		this.isAccountNonLocked = isAccountNonLocked;
	}

	/**
	 * Description: 系统用户的账户的证书是否是已过期的，true表是未过期的，false表示是已过期的。 证书过期的账户是不能被认证和登录的。
	 *
	 * Author: Amir Wang
	 * 
	 * @return 系统用户的账户的证书是否是已过期的判断结果。
	 */
	public boolean isCredentialsNonExpired() {
		return isCredentialsNonExpired;
	}

	/**
	 * Description: 设置系统用户的账户的证书的过期状态，设置为true表示是未过期的，设置为false表示是已过期的。
	 * 证书过期的账户是不能被认证和登录的。
	 *
	 * Author: Amir Wang
	 * 
	 * @param isCredentialsNonExpired
	 *            系统用户的账户的证书的过期状态。
	 */
	public void setCredentialsNonExpired(boolean isCredentialsNonExpired) {
		this.isCredentialsNonExpired = isCredentialsNonExpired;
	}

	/**
	 * Description: 判断系统用户的账户是否是已激活（或启用）的，true表示是已激活（或启用）的，false表示是未激活（或启用）的。
	 * 未激活（或启用）的账户是不能被认证和登录的。
	 *
	 * Author: Amir Wang
	 * 
	 * @return 系统用户的账户是否是已激活（或启用）的判断结果。
	 */
	public boolean isEnabled() {
		return isEnabled;
	}

	/**
	 * Description: 设置系统用户的账户的激活（或启用）状态，设置为true表示是已激活（或启用）的，设置为false表示是未激活（或启用）的。
	 * 未激活（或启用）的账户是不能被认证和登录的。
	 *
	 * Author: Amir Wang
	 * 
	 * @param isEnabled
	 *            系统用户的账户的激活（或启用）状态。
	 */
	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
