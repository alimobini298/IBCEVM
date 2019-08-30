/*
 * This file is generated by jOOQ.
 */
package com.ethvm.db.tables;


import com.ethvm.db.Indexes;
import com.ethvm.db.Keys;
import com.ethvm.db.Public;
import com.ethvm.db.tables.records.EthListContractMetadataRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.12"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EthListContractMetadata extends TableImpl<EthListContractMetadataRecord> {

    private static final long serialVersionUID = -194773769;

    /**
     * The reference instance of <code>public.eth_list_contract_metadata</code>
     */
    public static final EthListContractMetadata ETH_LIST_CONTRACT_METADATA = new EthListContractMetadata();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EthListContractMetadataRecord> getRecordType() {
        return EthListContractMetadataRecord.class;
    }

    /**
     * The column <code>public.eth_list_contract_metadata.address</code>.
     */
    public final TableField<EthListContractMetadataRecord, String> ADDRESS = createField("address", org.jooq.impl.SQLDataType.CHAR(42).nullable(false), this, "");

    /**
     * The column <code>public.eth_list_contract_metadata.name</code>.
     */
    public final TableField<EthListContractMetadataRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>public.eth_list_contract_metadata.symbol</code>.
     */
    public final TableField<EthListContractMetadataRecord, String> SYMBOL = createField("symbol", org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>public.eth_list_contract_metadata.decimals</code>.
     */
    public final TableField<EthListContractMetadataRecord, Integer> DECIMALS = createField("decimals", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.eth_list_contract_metadata.ens_address</code>.
     */
    public final TableField<EthListContractMetadataRecord, String> ENS_ADDRESS = createField("ens_address", org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>public.eth_list_contract_metadata.type</code>.
     */
    public final TableField<EthListContractMetadataRecord, String> TYPE = createField("type", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>public.eth_list_contract_metadata.logo</code>.
     */
    public final TableField<EthListContractMetadataRecord, String> LOGO = createField("logo", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.eth_list_contract_metadata.support</code>.
     */
    public final TableField<EthListContractMetadataRecord, String> SUPPORT = createField("support", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.eth_list_contract_metadata.social</code>.
     */
    public final TableField<EthListContractMetadataRecord, String> SOCIAL = createField("social", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.eth_list_contract_metadata.website</code>.
     */
    public final TableField<EthListContractMetadataRecord, String> WEBSITE = createField("website", org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * Create a <code>public.eth_list_contract_metadata</code> table reference
     */
    public EthListContractMetadata() {
        this(DSL.name("eth_list_contract_metadata"), null);
    }

    /**
     * Create an aliased <code>public.eth_list_contract_metadata</code> table reference
     */
    public EthListContractMetadata(String alias) {
        this(DSL.name(alias), ETH_LIST_CONTRACT_METADATA);
    }

    /**
     * Create an aliased <code>public.eth_list_contract_metadata</code> table reference
     */
    public EthListContractMetadata(Name alias) {
        this(alias, ETH_LIST_CONTRACT_METADATA);
    }

    private EthListContractMetadata(Name alias, Table<EthListContractMetadataRecord> aliased) {
        this(alias, aliased, null);
    }

    private EthListContractMetadata(Name alias, Table<EthListContractMetadataRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> EthListContractMetadata(Table<O> child, ForeignKey<O, EthListContractMetadataRecord> key) {
        super(child, key, ETH_LIST_CONTRACT_METADATA);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.ETH_LIST_CONTRACT_METADATA_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<EthListContractMetadataRecord> getPrimaryKey() {
        return Keys.ETH_LIST_CONTRACT_METADATA_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EthListContractMetadataRecord>> getKeys() {
        return Arrays.<UniqueKey<EthListContractMetadataRecord>>asList(Keys.ETH_LIST_CONTRACT_METADATA_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EthListContractMetadata as(String alias) {
        return new EthListContractMetadata(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EthListContractMetadata as(Name alias) {
        return new EthListContractMetadata(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EthListContractMetadata rename(String name) {
        return new EthListContractMetadata(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EthListContractMetadata rename(Name name) {
        return new EthListContractMetadata(name, null);
    }
}
