/**
 * 
 */
package com.spring_boot_jwt_entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * @author 48 - Tran Trung Vinh - 18079461
 *
 */
@Entity
@Table(name = "t_permission")
@Getter
@Setter
public class Permission extends BaseEntity
{
	 private String permissionName	;

	    private String permissionKey;
}
