package multithreading.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class SharedResource {
    static AtomicInteger atomicInteger = new AtomicInteger(0);
}
