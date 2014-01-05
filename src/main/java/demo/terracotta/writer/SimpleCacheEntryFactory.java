package demo.terracotta.writer;

import net.sf.ehcache.constructs.blocking.CacheEntryFactory;
import org.slf4j.Logger;

/**
 * Created by vch on 1/5/14.
 */
public class SimpleCacheEntryFactory implements CacheEntryFactory{
    private static final Logger LOG = org.slf4j.LoggerFactory.getLogger(SimpleCacheEntryFactory.class);
    @Override
    public Object createEntry(Object o) throws Exception {
        LOG.info("created entry using cache entry factory for key[" + o + "]");
        return "value-" + o;
    }
}
