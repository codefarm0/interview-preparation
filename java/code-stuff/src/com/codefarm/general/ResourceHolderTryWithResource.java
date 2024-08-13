package com.codefarm.general;

public class ResourceHolderTryWithResource implements AutoCloseable {
    private long resourceHandle;

    public ResourceHolderTryWithResource() {
        resourceHandle = initializeNativeResource();
    }

    private native long initializeNativeResource();
    private native void releaseNativeResource(long handle);

    @Override
    public void close() {
        if (resourceHandle != 0) {
            releaseNativeResource(resourceHandle);
            resourceHandle = 0;
        }
    }

    public static void main(String[] args) {
        try (ResourceHolderTryWithResource holder = new ResourceHolderTryWithResource()) {
            // Use the resource
        } // Automatically calls close() at the end of this block
    }
}
