package demo.foo;

import io.iron.ironworker.client.helpers.WorkerHelper;

import java.io.IOException;

public class DemoMain {
    public static void main(String[] args) throws IOException {
        final WorkerHelper workerHelper = WorkerHelper.fromArgs(args);
        final String payload = workerHelper.getPayload();
        System.err.println(payload);
    }
}
