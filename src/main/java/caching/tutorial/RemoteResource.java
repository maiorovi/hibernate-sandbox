package caching.tutorial;

public class RemoteResource {

    public String queryForData(String key) {
        System.out.println("returning response for " + key);
        return "response";
    }
}
