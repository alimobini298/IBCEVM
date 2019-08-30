/*
 * This file is generated by jOOQ.
 */
package com.ethvm.db.tables;


import com.ethvm.db.Indexes;
import com.ethvm.db.Keys;
import com.ethvm.db.Public;
import com.ethvm.db.tables.records.MinerBlockCountRecord;

import java.math.BigDecimal;
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
public class MinerBlockCount extends TableImpl<MinerBlockCountRecord> {

    private static final long serialVersionUID = -1537544485;

    /**
     * The reference instance of <code>public.miner_block_count</code>
     */
    public static final MinerBlockCount MINER_BLOCK_COUNT = new MinerBlockCount();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MinerBlockCountRecord> getRecordType() {
        return MinerBlockCountRecord.class;
    }

    /**
     * The column <code>public.miner_block_count.author</code>.
     */
    public final TableField<MinerBlockCountRecord, String> AUTHOR = createField("author", org.jooq.impl.SQLDataType.CHAR(42).nullable(false), this, "");

    /**
     * The column <code>public.miner_block_count.count</code>.
     */
    public final TableField<MinerBlockCountRecord, Long> COUNT = createField("count", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.miner_block_count.block_number</code>.
     */
    public final TableField<MinerBlockCountRecord, BigDecimal> BLOCK_NUMBER = createField("block_number", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

    /**
     * Create a <code>public.miner_block_count</code> table reference
     */
    public MinerBlockCount() {
        this(DSL.name("miner_block_count"), null);
    }

    /**
     * Create an aliased <code>public.miner_block_count</code> table reference
     */
    public MinerBlockCount(String alias) {
        this(DSL.name(alias), MINER_BLOCK_COUNT);
    }

    /**
     * Create an aliased <code>public.miner_block_count</code> table reference
     */
    public MinerBlockCount(Name alias) {
        this(alias, MINER_BLOCK_COUNT);
    }

    private MinerBlockCount(Name alias, Table<MinerBlockCountRecord> aliased) {
        this(alias, aliased, null);
    }

    private MinerBlockCount(Name alias, Table<MinerBlockCountRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> MinerBlockCount(Table<O> child, ForeignKey<O, MinerBlockCountRecord> key) {
        super(child, key, MINER_BLOCK_COUNT);
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
        return Arrays.<Index>asList(Indexes.MINER_BLOCK_COUNT_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MinerBlockCountRecord> getPrimaryKey() {
        return Keys.MINER_BLOCK_COUNT_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MinerBlockCountRecord>> getKeys() {
        return Arrays.<UniqueKey<MinerBlockCountRecord>>asList(Keys.MINER_BLOCK_COUNT_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MinerBlockCount as(String alias) {
        return new MinerBlockCount(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MinerBlockCount as(Name alias) {
        return new MinerBlockCount(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MinerBlockCount rename(String name) {
        return new MinerBlockCount(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MinerBlockCount rename(Name name) {
        return new MinerBlockCount(name, null);
    }
}
