/**
 * 
 */
package com.spring_boot_jwt_entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * @author 48 - Tran Trung Vinh - 18079461
 *
 */
@Entity
@Table(name = "t_token")
@Getter
@Setter
public class Token extends BaseEntity{
	 @Column(length = 1000)
	    private String token;

	    private Date tokenExpDate;
}
