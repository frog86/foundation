/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.security.impl.jooq.generation.tables;


import com.wuda.foundation.security.impl.jooq.generation.FoundationSecurity;
import com.wuda.foundation.security.impl.jooq.generation.Indexes;
import com.wuda.foundation.security.impl.jooq.generation.Keys;
import com.wuda.foundation.security.impl.jooq.generation.tables.records.SubjectPermissionRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row8;
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
 * subject可以代表用户，也可以代表想要访问其他资源的应用，suibject与permission的关联关系表。比如我们可以说user 【IS 
 * A】 subject
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SubjectPermission extends TableImpl<SubjectPermissionRecord> {

    private static final long serialVersionUID = 1128565598;

    /**
     * The reference instance of <code>foundation_security.subject_permission</code>
     */
    public static final SubjectPermission SUBJECT_PERMISSION = new SubjectPermission();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SubjectPermissionRecord> getRecordType() {
        return SubjectPermissionRecord.class;
    }

    /**
     * The column <code>foundation_security.subject_permission.id</code>.
     */
    public final TableField<SubjectPermissionRecord, ULong> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>foundation_security.subject_permission.subject_type</code>. subject的类型，比如subject代表用户
     */
    public final TableField<SubjectPermissionRecord, UByte> SUBJECT_TYPE = createField(DSL.name("subject_type"), org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false), this, "subject的类型，比如subject代表用户");

    /**
     * The column <code>foundation_security.subject_permission.subject_identifier</code>. 如果subject type代表用户，那么这个值可能就是用户ID
     */
    public final TableField<SubjectPermissionRecord, ULong> SUBJECT_IDENTIFIER = createField(DSL.name("subject_identifier"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "如果subject type代表用户，那么这个值可能就是用户ID");

    /**
     * The column <code>foundation_security.subject_permission.persission_target_id</code>.
     */
    public final TableField<SubjectPermissionRecord, ULong> PERSISSION_TARGET_ID = createField(DSL.name("persission_target_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>foundation_security.subject_permission.permission_action_id</code>. permission action id，如果为0，则表示没有分配action
     */
    public final TableField<SubjectPermissionRecord, ULong> PERMISSION_ACTION_ID = createField(DSL.name("permission_action_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "permission action id，如果为0，则表示没有分配action");

    /**
     * The column <code>foundation_security.subject_permission.create_time</code>.
     */
    public final TableField<SubjectPermissionRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>foundation_security.subject_permission.create_user_id</code>.
     */
    public final TableField<SubjectPermissionRecord, ULong> CREATE_USER_ID = createField(DSL.name("create_user_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>foundation_security.subject_permission.is_deleted</code>.
     */
    public final TableField<SubjectPermissionRecord, ULong> IS_DELETED = createField(DSL.name("is_deleted"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * Create a <code>foundation_security.subject_permission</code> table reference
     */
    public SubjectPermission() {
        this(DSL.name("subject_permission"), null);
    }

    /**
     * Create an aliased <code>foundation_security.subject_permission</code> table reference
     */
    public SubjectPermission(String alias) {
        this(DSL.name(alias), SUBJECT_PERMISSION);
    }

    /**
     * Create an aliased <code>foundation_security.subject_permission</code> table reference
     */
    public SubjectPermission(Name alias) {
        this(alias, SUBJECT_PERMISSION);
    }

    private SubjectPermission(Name alias, Table<SubjectPermissionRecord> aliased) {
        this(alias, aliased, null);
    }

    private SubjectPermission(Name alias, Table<SubjectPermissionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("subject可以代表用户，也可以代表想要访问其他资源的应用，suibject与permission的关联关系表。比如我们可以说user 【IS A】 subject"), TableOptions.table());
    }

    public <O extends Record> SubjectPermission(Table<O> child, ForeignKey<O, SubjectPermissionRecord> key) {
        super(child, key, SUBJECT_PERMISSION);
    }

    @Override
    public Schema getSchema() {
        return FoundationSecurity.FOUNDATION_SECURITY;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.SUBJECT_PERMISSION_FK_PERMISSION_ACTION_ID, Indexes.SUBJECT_PERMISSION_FK_PERMISSION_TARGET_ID);
    }

    @Override
    public UniqueKey<SubjectPermissionRecord> getPrimaryKey() {
        return Keys.KEY_SUBJECT_PERMISSION_PRIMARY;
    }

    @Override
    public List<UniqueKey<SubjectPermissionRecord>> getKeys() {
        return Arrays.<UniqueKey<SubjectPermissionRecord>>asList(Keys.KEY_SUBJECT_PERMISSION_PRIMARY, Keys.KEY_SUBJECT_PERMISSION_IDX_SUBJECT);
    }

    @Override
    public SubjectPermission as(String alias) {
        return new SubjectPermission(DSL.name(alias), this);
    }

    @Override
    public SubjectPermission as(Name alias) {
        return new SubjectPermission(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SubjectPermission rename(String name) {
        return new SubjectPermission(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SubjectPermission rename(Name name) {
        return new SubjectPermission(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<ULong, UByte, ULong, ULong, ULong, LocalDateTime, ULong, ULong> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}