/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.jooq.code.generation.security.tables;


import com.wuda.foundation.jooq.code.generation.security.FoundationSecurity;
import com.wuda.foundation.jooq.code.generation.security.Keys;
import com.wuda.foundation.jooq.code.generation.security.tables.records.PermissionRoleRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row9;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.types.UByte;
import org.jooq.types.ULong;


/**
 * 角色
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PermissionRole extends TableImpl<PermissionRoleRecord> {

    private static final long serialVersionUID = -1431641945;

    /**
     * The reference instance of <code>foundation_security.permission_role</code>
     */
    public static final PermissionRole PERMISSION_ROLE = new PermissionRole();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PermissionRoleRecord> getRecordType() {
        return PermissionRoleRecord.class;
    }

    /**
     * The column <code>foundation_security.permission_role.permission_role_id</code>.
     */
    public final TableField<PermissionRoleRecord, ULong> PERMISSION_ROLE_ID = createField(DSL.name("permission_role_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>foundation_security.permission_role.type</code>. 角色的类型，比如某一类型的角色只用于用户在组中的角色；某一类型的角色只用于菜单访问控制
     */
    public final TableField<PermissionRoleRecord, UByte> TYPE = createField(DSL.name("type"), org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false), this, "角色的类型，比如某一类型的角色只用于用户在组中的角色；某一类型的角色只用于菜单访问控制");

    /**
     * The column <code>foundation_security.permission_role.name</code>. 名称
     */
    public final TableField<PermissionRoleRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "名称");

    /**
     * The column <code>foundation_security.permission_role.description</code>. 描述
     */
    public final TableField<PermissionRoleRecord, String> DESCRIPTION = createField(DSL.name("description"), org.jooq.impl.SQLDataType.VARCHAR(256), this, "描述");

    /**
     * The column <code>foundation_security.permission_role.create_time</code>.
     */
    public final TableField<PermissionRoleRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>foundation_security.permission_role.create_user_id</code>.
     */
    public final TableField<PermissionRoleRecord, ULong> CREATE_USER_ID = createField(DSL.name("create_user_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>foundation_security.permission_role.last_modify_time</code>.
     */
    public final TableField<PermissionRoleRecord, LocalDateTime> LAST_MODIFY_TIME = createField(DSL.name("last_modify_time"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>foundation_security.permission_role.last_modify_user_id</code>.
     */
    public final TableField<PermissionRoleRecord, ULong> LAST_MODIFY_USER_ID = createField(DSL.name("last_modify_user_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>foundation_security.permission_role.is_deleted</code>.
     */
    public final TableField<PermissionRoleRecord, ULong> IS_DELETED = createField(DSL.name("is_deleted"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * Create a <code>foundation_security.permission_role</code> table reference
     */
    public PermissionRole() {
        this(DSL.name("permission_role"), null);
    }

    /**
     * Create an aliased <code>foundation_security.permission_role</code> table reference
     */
    public PermissionRole(String alias) {
        this(DSL.name(alias), PERMISSION_ROLE);
    }

    /**
     * Create an aliased <code>foundation_security.permission_role</code> table reference
     */
    public PermissionRole(Name alias) {
        this(alias, PERMISSION_ROLE);
    }

    private PermissionRole(Name alias, Table<PermissionRoleRecord> aliased) {
        this(alias, aliased, null);
    }

    private PermissionRole(Name alias, Table<PermissionRoleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("角色"), TableOptions.table());
    }

    public <O extends Record> PermissionRole(Table<O> child, ForeignKey<O, PermissionRoleRecord> key) {
        super(child, key, PERMISSION_ROLE);
    }

    @Override
    public Schema getSchema() {
        return FoundationSecurity.FOUNDATION_SECURITY;
    }

    @Override
    public Identity<PermissionRoleRecord, ULong> getIdentity() {
        return Keys.IDENTITY_PERMISSION_ROLE;
    }

    @Override
    public UniqueKey<PermissionRoleRecord> getPrimaryKey() {
        return Keys.KEY_PERMISSION_ROLE_PRIMARY;
    }

    @Override
    public List<UniqueKey<PermissionRoleRecord>> getKeys() {
        return Arrays.<UniqueKey<PermissionRoleRecord>>asList(Keys.KEY_PERMISSION_ROLE_PRIMARY);
    }

    @Override
    public PermissionRole as(String alias) {
        return new PermissionRole(DSL.name(alias), this);
    }

    @Override
    public PermissionRole as(Name alias) {
        return new PermissionRole(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PermissionRole rename(String name) {
        return new PermissionRole(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PermissionRole rename(Name name) {
        return new PermissionRole(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<ULong, UByte, String, String, LocalDateTime, ULong, LocalDateTime, ULong, ULong> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}
