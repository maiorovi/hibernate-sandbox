package caching.tutorial;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

import java.util.concurrent.ExecutionException;

public class Caller {
        private RemoteResource remoteResource;
        private final LoadingCache<String, String> build = CacheBuilder.<String, String>newBuilder()
                .maximumSize(1000)
                .build(new CacheLoader<String, String>() {
                    @Override
                    public String load(String key) throws Exception {
                        return remoteResource.queryForData(key);
                    }
                });

    public Caller(RemoteResource remoteResource) {
        this.remoteResource = remoteResource;
    }

    public String doJobOnClient(String key) throws ExecutionException {
            System.out.println();
            return build.get(key);
        }
}
