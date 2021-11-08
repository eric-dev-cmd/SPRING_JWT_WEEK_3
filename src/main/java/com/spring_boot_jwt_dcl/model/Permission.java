package com.spring_boot_jwt_dcl.model;
import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Permission extends BaseEntity{
    private String permissionName;
    private String permissionKey;
}
