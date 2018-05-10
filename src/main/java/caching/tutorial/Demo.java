package caching.tutorial;

import java.util.concurrent.ExecutionException;

public class Demo {
    public static void main(String[] args) throws ExecutionException {
        final Caller caller = new Caller(new RemoteResource());

        caller.doJobOnClient("one");
        caller.doJobOnClient("two");
        caller.doJobOnClient("three");
        caller.doJobOnClient("one");
        caller.doJobOnClient("two");
    }
}
