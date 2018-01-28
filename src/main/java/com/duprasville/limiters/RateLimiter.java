package com.duprasville.limiters;

public interface RateLimiter {
    boolean tryAcquire(long permits);

    default boolean tryAcquire() {
        return tryAcquire(1L);
    }

    default void setRate(long permitsPerSecond) {
    }
}
