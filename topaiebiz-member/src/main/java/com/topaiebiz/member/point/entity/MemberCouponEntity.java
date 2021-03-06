package com.topaiebiz.member.point.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.nebulapaas.data.mybatis.common.BaseBizEntity;

/**
 * 
 * Description 会员优惠券，存储会员拥有的优惠券。  
 * 
 * 
 * Author Scott
 *    
 * Date 2017年9月12日 上午10:47:22 
 * 
 * Copyright Cognieon technology group co.LTD. All rights reserved.
 * 
 * Notice 本内容仅限于授权后使用，禁止非授权传阅以及私自用于其他商业目的。
 */
@TableName("t_mem_member_coupon")
public class MemberCouponEntity extends BaseBizEntity<Long> {
	
		/** 序列化版本号。 */
		@TableField(exist = false)
		private static final long serialVersionUID = -258602217296068892L;
	
		/** 会员编号。*/
		private Long memberId;
		
		/** 是否已使用（1 使用，0未使用）。*/
		private Integer usageState;
		
		/** 优惠券。*/
		private Long couponId;
		
		/** 优惠券的所属店铺。*/
		private Long storeId;
		
		/** 领取时间。*/
		private Date receiverTime;
		
		/** 备注*/
		private String memo;

		@TableField(exist=false)
		/** 最后修改人编号。取值为最后修改人的全局唯一主键标识符。 */
		private Long lastModifierId;

		/** 最后修改时间。默认取值为null，当发生修改时取系统的当前时间。 */
		@TableField(exist=false)
		private Date lastModifiedTime;
		
		public String getMemo() {
			return memo;
		}

		public void setMemo(String memo) {
			this.memo = memo;
		}

		public Long getMemberId() {
			return memberId;
		}

		public void setMemberId(Long memberId) {
			this.memberId = memberId;
		}

		public Integer getUsageState() {
			return usageState;
		}

		public void setUsageState(Integer usageState) {
			this.usageState = usageState;
		}

		public Long getCouponId() {
			return couponId;
		}

		public void setCouponId(Long couponId) {
			this.couponId = couponId;
		}

		public Long getStoreId() {
			return storeId;
		}

		public void setStoreId(Long storeId) {
			this.storeId = storeId;
		}

		public Date getReceiverTime() {
			return receiverTime;
		}

		public void setReceiverTime(Date receiverTime) {
			this.receiverTime = receiverTime;
		}
	
		

}
