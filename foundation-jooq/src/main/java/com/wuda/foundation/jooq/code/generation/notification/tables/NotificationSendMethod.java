/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.jooq.code.generation.notification.tables;


import com.wuda.foundation.jooq.code.generation.notification.FoundationNotification;
import com.wuda.foundation.jooq.code.generation.notification.Keys;
import com.wuda.foundation.jooq.code.generation.notification.tables.records.NotificationSendMethodRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
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
import org.jooq.types.ULong;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;


/**
 * 通知发表的方式，比如通过email，sms发送，很多国外的术语中，database表示保存到本地数据库表，也就是通常所说的站内信
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class NotificationSendMethod extends TableImpl<NotificationSendMethodRecord> {

    private static final long serialVersionUID = -1070172192;

    /**
     * The reference instance of <code>foundation_notification.notification_send_method</code>
     */
    public static final NotificationSendMethod NOTIFICATION_SEND_METHOD = new NotificationSendMethod();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<NotificationSendMethodRecord> getRecordType() {
        return NotificationSendMethodRecord.class;
    }

    /**
     * The column <code>foundation_notification.notification_send_method.notification_send_method_id</code>.
     */
    public final TableField<NotificationSendMethodRecord, ULong> NOTIFICATION_SEND_METHOD_ID = createField(DSL.name("notification_send_method_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>foundation_notification.notification_send_method.name</code>. 发送方式的名称，比如email
     */
    public final TableField<NotificationSendMethodRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "发送方式的名称，比如email");

    /**
     * The column <code>foundation_notification.notification_send_method.description</code>. 基本的描述信息
     */
    public final TableField<NotificationSendMethodRecord, String> DESCRIPTION = createField(DSL.name("description"), org.jooq.impl.SQLDataType.VARCHAR(256), this, "基本的描述信息");

    /**
     * The column <code>foundation_notification.notification_send_method.create_time</code>.
     */
    public final TableField<NotificationSendMethodRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>foundation_notification.notification_send_method.create_user_id</code>.
     */
    public final TableField<NotificationSendMethodRecord, ULong> CREATE_USER_ID = createField(DSL.name("create_user_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>foundation_notification.notification_send_method.last_modify_time</code>.
     */
    public final TableField<NotificationSendMethodRecord, LocalDateTime> LAST_MODIFY_TIME = createField(DSL.name("last_modify_time"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>foundation_notification.notification_send_method.last_modify_user_id</code>.
     */
    public final TableField<NotificationSendMethodRecord, ULong> LAST_MODIFY_USER_ID = createField(DSL.name("last_modify_user_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>foundation_notification.notification_send_method.is_deleted</code>.
     */
    public final TableField<NotificationSendMethodRecord, ULong> IS_DELETED = createField(DSL.name("is_deleted"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * Create a <code>foundation_notification.notification_send_method</code> table reference
     */
    public NotificationSendMethod() {
        this(DSL.name("notification_send_method"), null);
    }

    /**
     * Create an aliased <code>foundation_notification.notification_send_method</code> table reference
     */
    public NotificationSendMethod(String alias) {
        this(DSL.name(alias), NOTIFICATION_SEND_METHOD);
    }

    /**
     * Create an aliased <code>foundation_notification.notification_send_method</code> table reference
     */
    public NotificationSendMethod(Name alias) {
        this(alias, NOTIFICATION_SEND_METHOD);
    }

    private NotificationSendMethod(Name alias, Table<NotificationSendMethodRecord> aliased) {
        this(alias, aliased, null);
    }

    private NotificationSendMethod(Name alias, Table<NotificationSendMethodRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("通知发表的方式，比如通过email，sms发送，很多国外的术语中，database表示保存到本地数据库表，也就是通常所说的站内信"), TableOptions.table());
    }

    public <O extends Record> NotificationSendMethod(Table<O> child, ForeignKey<O, NotificationSendMethodRecord> key) {
        super(child, key, NOTIFICATION_SEND_METHOD);
    }

    @Override
    public Schema getSchema() {
        return FoundationNotification.FOUNDATION_NOTIFICATION;
    }

    @Override
    public Identity<NotificationSendMethodRecord, ULong> getIdentity() {
        return Keys.IDENTITY_NOTIFICATION_SEND_METHOD;
    }

    @Override
    public UniqueKey<NotificationSendMethodRecord> getPrimaryKey() {
        return Keys.KEY_NOTIFICATION_SEND_METHOD_PRIMARY;
    }

    @Override
    public List<UniqueKey<NotificationSendMethodRecord>> getKeys() {
        return Arrays.<UniqueKey<NotificationSendMethodRecord>>asList(Keys.KEY_NOTIFICATION_SEND_METHOD_PRIMARY, Keys.KEY_NOTIFICATION_SEND_METHOD_NAME_UNIQUE);
    }

    @Override
    public NotificationSendMethod as(String alias) {
        return new NotificationSendMethod(DSL.name(alias), this);
    }

    @Override
    public NotificationSendMethod as(Name alias) {
        return new NotificationSendMethod(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public NotificationSendMethod rename(String name) {
        return new NotificationSendMethod(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public NotificationSendMethod rename(Name name) {
        return new NotificationSendMethod(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<ULong, String, String, LocalDateTime, ULong, LocalDateTime, ULong, ULong> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}
