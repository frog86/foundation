/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.commons.impl.jooq.generation.tables.daos;


import com.wuda.foundation.commons.impl.jooq.generation.tables.TreeNode;
import com.wuda.foundation.commons.impl.jooq.generation.tables.records.TreeNodeRecord;

import java.time.LocalDateTime;
import java.util.List;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.jooq.types.UByte;
import org.jooq.types.ULong;


/**
 * 树形结构的节点。有很多数据是用树形结构组织的，比如商品分类，文章分类，组织架构等等，通常我们都是为它们单独设计一个表，比如商品分类表，部门表，然后每个表都写了差不多相同的处理逻辑，如何避免重复处理类似树形的数据呢？这个表的目的就是为了统一处理这些类似树形结构的表，以这个表为核心，扩展出商品分类，文章分类，部门等。
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TreeNodeDao extends DAOImpl<TreeNodeRecord, com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.TreeNode, ULong> {

    /**
     * Create a new TreeNodeDao without any configuration
     */
    public TreeNodeDao() {
        super(TreeNode.TREE_NODE, com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.TreeNode.class);
    }

    /**
     * Create a new TreeNodeDao with an attached configuration
     */
    public TreeNodeDao(Configuration configuration) {
        super(TreeNode.TREE_NODE, com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.TreeNode.class, configuration);
    }

    @Override
    public ULong getId(com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.TreeNode object) {
        return object.getTreeNodeId();
    }

    /**
     * Fetch records that have <code>tree_node_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.TreeNode> fetchRangeOfTreeNodeId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(TreeNode.TREE_NODE.TREE_NODE_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>tree_node_id IN (values)</code>
     */
    public List<com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.TreeNode> fetchByTreeNodeId(ULong... values) {
        return fetch(TreeNode.TREE_NODE.TREE_NODE_ID, values);
    }

    /**
     * Fetch a unique record that has <code>tree_node_id = value</code>
     */
    public com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.TreeNode fetchOneByTreeNodeId(ULong value) {
        return fetchOne(TreeNode.TREE_NODE.TREE_NODE_ID, value);
    }

    /**
     * Fetch records that have <code>root_tree_node_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.TreeNode> fetchRangeOfRootTreeNodeId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(TreeNode.TREE_NODE.ROOT_TREE_NODE_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>root_tree_node_id IN (values)</code>
     */
    public List<com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.TreeNode> fetchByRootTreeNodeId(ULong... values) {
        return fetch(TreeNode.TREE_NODE.ROOT_TREE_NODE_ID, values);
    }

    /**
     * Fetch records that have <code>parent_tree_node_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.TreeNode> fetchRangeOfParentTreeNodeId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(TreeNode.TREE_NODE.PARENT_TREE_NODE_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>parent_tree_node_id IN (values)</code>
     */
    public List<com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.TreeNode> fetchByParentTreeNodeId(ULong... values) {
        return fetch(TreeNode.TREE_NODE.PARENT_TREE_NODE_ID, values);
    }

    /**
     * Fetch records that have <code>depth BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.TreeNode> fetchRangeOfDepth(UByte lowerInclusive, UByte upperInclusive) {
        return fetchRange(TreeNode.TREE_NODE.DEPTH, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>depth IN (values)</code>
     */
    public List<com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.TreeNode> fetchByDepth(UByte... values) {
        return fetch(TreeNode.TREE_NODE.DEPTH, values);
    }

    /**
     * Fetch records that have <code>create_time BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.TreeNode> fetchRangeOfCreateTime(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(TreeNode.TREE_NODE.CREATE_TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.TreeNode> fetchByCreateTime(LocalDateTime... values) {
        return fetch(TreeNode.TREE_NODE.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>create_user_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.TreeNode> fetchRangeOfCreateUserId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(TreeNode.TREE_NODE.CREATE_USER_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>create_user_id IN (values)</code>
     */
    public List<com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.TreeNode> fetchByCreateUserId(ULong... values) {
        return fetch(TreeNode.TREE_NODE.CREATE_USER_ID, values);
    }

    /**
     * Fetch records that have <code>last_modify_time BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.TreeNode> fetchRangeOfLastModifyTime(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(TreeNode.TREE_NODE.LAST_MODIFY_TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>last_modify_time IN (values)</code>
     */
    public List<com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.TreeNode> fetchByLastModifyTime(LocalDateTime... values) {
        return fetch(TreeNode.TREE_NODE.LAST_MODIFY_TIME, values);
    }

    /**
     * Fetch records that have <code>last_modify_user_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.TreeNode> fetchRangeOfLastModifyUserId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(TreeNode.TREE_NODE.LAST_MODIFY_USER_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>last_modify_user_id IN (values)</code>
     */
    public List<com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.TreeNode> fetchByLastModifyUserId(ULong... values) {
        return fetch(TreeNode.TREE_NODE.LAST_MODIFY_USER_ID, values);
    }

    /**
     * Fetch records that have <code>is_deleted BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.TreeNode> fetchRangeOfIsDeleted(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(TreeNode.TREE_NODE.IS_DELETED, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>is_deleted IN (values)</code>
     */
    public List<com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.TreeNode> fetchByIsDeleted(ULong... values) {
        return fetch(TreeNode.TREE_NODE.IS_DELETED, values);
    }
}
