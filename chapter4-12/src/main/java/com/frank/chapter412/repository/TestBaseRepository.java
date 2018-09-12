/**
 * This class is generated by GenerationCodeUtil.
*/
package com.frank.chapter412.repository;

import org.apache.commons.lang3.tuple.Pair;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.io.Serializable;

import static com.frank.chapter412.constant.Constants.*;


public abstract class TestBaseRepository<T extends Serializable> extends BaseRepository<T> {

    @Autowired
    @Qualifier(BD_USE_READ_DB)
    protected DSLContext dslRead;

    @Autowired
    @Qualifier(BD_USE_WRITE_DB)
    protected DSLContext dslWrite;

    @Override
    protected Pair<DSLContext, DSLContext> dslSelect() {
        return Pair.of(dslRead, dslWrite);
    }
}