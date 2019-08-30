/*
 * This file is generated by jOOQ.
 */
package com.ethvm.db.tables.records;


import com.ethvm.db.tables.ForkBlockHeader;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record22;
import org.jooq.Row22;
import org.jooq.impl.TableRecordImpl;


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
public class ForkBlockHeaderRecord extends TableRecordImpl<ForkBlockHeaderRecord> implements Record22<BigDecimal, String, String, BigDecimal, String, String, String, String, String, String, BigDecimal, BigDecimal, String, BigDecimal, BigDecimal, Timestamp, Integer, Integer, Integer, String, Integer, String> {

    private static final long serialVersionUID = 376694356;

    /**
     * Setter for <code>public.fork_block_header.number</code>.
     */
    public ForkBlockHeaderRecord setNumber(BigDecimal value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.fork_block_header.number</code>.
     */
    public BigDecimal getNumber() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for <code>public.fork_block_header.hash</code>.
     */
    public ForkBlockHeaderRecord setHash(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.fork_block_header.hash</code>.
     */
    public String getHash() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.fork_block_header.parent_hash</code>.
     */
    public ForkBlockHeaderRecord setParentHash(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.fork_block_header.parent_hash</code>.
     */
    public String getParentHash() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.fork_block_header.nonce</code>.
     */
    public ForkBlockHeaderRecord setNonce(BigDecimal value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.fork_block_header.nonce</code>.
     */
    public BigDecimal getNonce() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>public.fork_block_header.sha3_uncles</code>.
     */
    public ForkBlockHeaderRecord setSha3Uncles(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.fork_block_header.sha3_uncles</code>.
     */
    public String getSha3Uncles() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.fork_block_header.logs_bloom</code>.
     */
    public ForkBlockHeaderRecord setLogsBloom(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.fork_block_header.logs_bloom</code>.
     */
    public String getLogsBloom() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.fork_block_header.transactions_root</code>.
     */
    public ForkBlockHeaderRecord setTransactionsRoot(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>public.fork_block_header.transactions_root</code>.
     */
    public String getTransactionsRoot() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.fork_block_header.state_root</code>.
     */
    public ForkBlockHeaderRecord setStateRoot(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>public.fork_block_header.state_root</code>.
     */
    public String getStateRoot() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.fork_block_header.receipts_root</code>.
     */
    public ForkBlockHeaderRecord setReceiptsRoot(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>public.fork_block_header.receipts_root</code>.
     */
    public String getReceiptsRoot() {
        return (String) get(8);
    }

    /**
     * Setter for <code>public.fork_block_header.author</code>.
     */
    public ForkBlockHeaderRecord setAuthor(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>public.fork_block_header.author</code>.
     */
    public String getAuthor() {
        return (String) get(9);
    }

    /**
     * Setter for <code>public.fork_block_header.difficulty</code>.
     */
    public ForkBlockHeaderRecord setDifficulty(BigDecimal value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>public.fork_block_header.difficulty</code>.
     */
    public BigDecimal getDifficulty() {
        return (BigDecimal) get(10);
    }

    /**
     * Setter for <code>public.fork_block_header.total_difficulty</code>.
     */
    public ForkBlockHeaderRecord setTotalDifficulty(BigDecimal value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>public.fork_block_header.total_difficulty</code>.
     */
    public BigDecimal getTotalDifficulty() {
        return (BigDecimal) get(11);
    }

    /**
     * Setter for <code>public.fork_block_header.extra_data</code>.
     */
    public ForkBlockHeaderRecord setExtraData(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>public.fork_block_header.extra_data</code>.
     */
    public String getExtraData() {
        return (String) get(12);
    }

    /**
     * Setter for <code>public.fork_block_header.gas_limit</code>.
     */
    public ForkBlockHeaderRecord setGasLimit(BigDecimal value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>public.fork_block_header.gas_limit</code>.
     */
    public BigDecimal getGasLimit() {
        return (BigDecimal) get(13);
    }

    /**
     * Setter for <code>public.fork_block_header.gas_used</code>.
     */
    public ForkBlockHeaderRecord setGasUsed(BigDecimal value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>public.fork_block_header.gas_used</code>.
     */
    public BigDecimal getGasUsed() {
        return (BigDecimal) get(14);
    }

    /**
     * Setter for <code>public.fork_block_header.timestamp</code>.
     */
    public ForkBlockHeaderRecord setTimestamp(Timestamp value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>public.fork_block_header.timestamp</code>.
     */
    public Timestamp getTimestamp() {
        return (Timestamp) get(15);
    }

    /**
     * Setter for <code>public.fork_block_header.block_time</code>.
     */
    public ForkBlockHeaderRecord setBlockTime(Integer value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>public.fork_block_header.block_time</code>.
     */
    public Integer getBlockTime() {
        return (Integer) get(16);
    }

    /**
     * Setter for <code>public.fork_block_header.size</code>.
     */
    public ForkBlockHeaderRecord setSize(Integer value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>public.fork_block_header.size</code>.
     */
    public Integer getSize() {
        return (Integer) get(17);
    }

    /**
     * Setter for <code>public.fork_block_header.uncle_count</code>.
     */
    public ForkBlockHeaderRecord setUncleCount(Integer value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>public.fork_block_header.uncle_count</code>.
     */
    public Integer getUncleCount() {
        return (Integer) get(18);
    }

    /**
     * Setter for <code>public.fork_block_header.uncle_hashes</code>.
     */
    public ForkBlockHeaderRecord setUncleHashes(String value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>public.fork_block_header.uncle_hashes</code>.
     */
    public String getUncleHashes() {
        return (String) get(19);
    }

    /**
     * Setter for <code>public.fork_block_header.transaction_count</code>.
     */
    public ForkBlockHeaderRecord setTransactionCount(Integer value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>public.fork_block_header.transaction_count</code>.
     */
    public Integer getTransactionCount() {
        return (Integer) get(20);
    }

    /**
     * Setter for <code>public.fork_block_header.transaction_hashes</code>.
     */
    public ForkBlockHeaderRecord setTransactionHashes(String value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>public.fork_block_header.transaction_hashes</code>.
     */
    public String getTransactionHashes() {
        return (String) get(21);
    }

    // -------------------------------------------------------------------------
    // Record22 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row22<BigDecimal, String, String, BigDecimal, String, String, String, String, String, String, BigDecimal, BigDecimal, String, BigDecimal, BigDecimal, Timestamp, Integer, Integer, Integer, String, Integer, String> fieldsRow() {
        return (Row22) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row22<BigDecimal, String, String, BigDecimal, String, String, String, String, String, String, BigDecimal, BigDecimal, String, BigDecimal, BigDecimal, Timestamp, Integer, Integer, Integer, String, Integer, String> valuesRow() {
        return (Row22) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field1() {
        return ForkBlockHeader.FORK_BLOCK_HEADER.NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ForkBlockHeader.FORK_BLOCK_HEADER.HASH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ForkBlockHeader.FORK_BLOCK_HEADER.PARENT_HASH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field4() {
        return ForkBlockHeader.FORK_BLOCK_HEADER.NONCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ForkBlockHeader.FORK_BLOCK_HEADER.SHA3_UNCLES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ForkBlockHeader.FORK_BLOCK_HEADER.LOGS_BLOOM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return ForkBlockHeader.FORK_BLOCK_HEADER.TRANSACTIONS_ROOT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return ForkBlockHeader.FORK_BLOCK_HEADER.STATE_ROOT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return ForkBlockHeader.FORK_BLOCK_HEADER.RECEIPTS_ROOT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return ForkBlockHeader.FORK_BLOCK_HEADER.AUTHOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field11() {
        return ForkBlockHeader.FORK_BLOCK_HEADER.DIFFICULTY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field12() {
        return ForkBlockHeader.FORK_BLOCK_HEADER.TOTAL_DIFFICULTY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return ForkBlockHeader.FORK_BLOCK_HEADER.EXTRA_DATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field14() {
        return ForkBlockHeader.FORK_BLOCK_HEADER.GAS_LIMIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field15() {
        return ForkBlockHeader.FORK_BLOCK_HEADER.GAS_USED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field16() {
        return ForkBlockHeader.FORK_BLOCK_HEADER.TIMESTAMP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field17() {
        return ForkBlockHeader.FORK_BLOCK_HEADER.BLOCK_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field18() {
        return ForkBlockHeader.FORK_BLOCK_HEADER.SIZE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field19() {
        return ForkBlockHeader.FORK_BLOCK_HEADER.UNCLE_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field20() {
        return ForkBlockHeader.FORK_BLOCK_HEADER.UNCLE_HASHES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field21() {
        return ForkBlockHeader.FORK_BLOCK_HEADER.TRANSACTION_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field22() {
        return ForkBlockHeader.FORK_BLOCK_HEADER.TRANSACTION_HASHES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component1() {
        return getNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getHash();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getParentHash();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component4() {
        return getNonce();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getSha3Uncles();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getLogsBloom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getTransactionsRoot();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getStateRoot();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getReceiptsRoot();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getAuthor();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component11() {
        return getDifficulty();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component12() {
        return getTotalDifficulty();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getExtraData();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component14() {
        return getGasLimit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component15() {
        return getGasUsed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component16() {
        return getTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component17() {
        return getBlockTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component18() {
        return getSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component19() {
        return getUncleCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component20() {
        return getUncleHashes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component21() {
        return getTransactionCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component22() {
        return getTransactionHashes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value1() {
        return getNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getHash();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getParentHash();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value4() {
        return getNonce();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getSha3Uncles();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getLogsBloom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getTransactionsRoot();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getStateRoot();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getReceiptsRoot();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getAuthor();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value11() {
        return getDifficulty();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value12() {
        return getTotalDifficulty();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getExtraData();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value14() {
        return getGasLimit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value15() {
        return getGasUsed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value16() {
        return getTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value17() {
        return getBlockTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value18() {
        return getSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value19() {
        return getUncleCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value20() {
        return getUncleHashes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value21() {
        return getTransactionCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value22() {
        return getTransactionHashes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ForkBlockHeaderRecord value1(BigDecimal value) {
        setNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ForkBlockHeaderRecord value2(String value) {
        setHash(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ForkBlockHeaderRecord value3(String value) {
        setParentHash(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ForkBlockHeaderRecord value4(BigDecimal value) {
        setNonce(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ForkBlockHeaderRecord value5(String value) {
        setSha3Uncles(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ForkBlockHeaderRecord value6(String value) {
        setLogsBloom(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ForkBlockHeaderRecord value7(String value) {
        setTransactionsRoot(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ForkBlockHeaderRecord value8(String value) {
        setStateRoot(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ForkBlockHeaderRecord value9(String value) {
        setReceiptsRoot(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ForkBlockHeaderRecord value10(String value) {
        setAuthor(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ForkBlockHeaderRecord value11(BigDecimal value) {
        setDifficulty(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ForkBlockHeaderRecord value12(BigDecimal value) {
        setTotalDifficulty(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ForkBlockHeaderRecord value13(String value) {
        setExtraData(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ForkBlockHeaderRecord value14(BigDecimal value) {
        setGasLimit(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ForkBlockHeaderRecord value15(BigDecimal value) {
        setGasUsed(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ForkBlockHeaderRecord value16(Timestamp value) {
        setTimestamp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ForkBlockHeaderRecord value17(Integer value) {
        setBlockTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ForkBlockHeaderRecord value18(Integer value) {
        setSize(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ForkBlockHeaderRecord value19(Integer value) {
        setUncleCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ForkBlockHeaderRecord value20(String value) {
        setUncleHashes(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ForkBlockHeaderRecord value21(Integer value) {
        setTransactionCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ForkBlockHeaderRecord value22(String value) {
        setTransactionHashes(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ForkBlockHeaderRecord values(BigDecimal value1, String value2, String value3, BigDecimal value4, String value5, String value6, String value7, String value8, String value9, String value10, BigDecimal value11, BigDecimal value12, String value13, BigDecimal value14, BigDecimal value15, Timestamp value16, Integer value17, Integer value18, Integer value19, String value20, Integer value21, String value22) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        value21(value21);
        value22(value22);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ForkBlockHeaderRecord
     */
    public ForkBlockHeaderRecord() {
        super(ForkBlockHeader.FORK_BLOCK_HEADER);
    }

    /**
     * Create a detached, initialised ForkBlockHeaderRecord
     */
    public ForkBlockHeaderRecord(BigDecimal number, String hash, String parentHash, BigDecimal nonce, String sha3Uncles, String logsBloom, String transactionsRoot, String stateRoot, String receiptsRoot, String author, BigDecimal difficulty, BigDecimal totalDifficulty, String extraData, BigDecimal gasLimit, BigDecimal gasUsed, Timestamp timestamp, Integer blockTime, Integer size, Integer uncleCount, String uncleHashes, Integer transactionCount, String transactionHashes) {
        super(ForkBlockHeader.FORK_BLOCK_HEADER);

        set(0, number);
        set(1, hash);
        set(2, parentHash);
        set(3, nonce);
        set(4, sha3Uncles);
        set(5, logsBloom);
        set(6, transactionsRoot);
        set(7, stateRoot);
        set(8, receiptsRoot);
        set(9, author);
        set(10, difficulty);
        set(11, totalDifficulty);
        set(12, extraData);
        set(13, gasLimit);
        set(14, gasUsed);
        set(15, timestamp);
        set(16, blockTime);
        set(17, size);
        set(18, uncleCount);
        set(19, uncleHashes);
        set(20, transactionCount);
        set(21, transactionHashes);
    }
}
