package com.codefarm.general;

public class ResourceHolderFinally {
    private long resourceHandle;

    public ResourceHolderFinally() {
        resourceHandle = initializeNativeResource();
    }

    private native long initializeNativeResource();
    private native void releaseNativeResource(long handle);

    public void useResource() {
        // Use the resource
    }

    public void cleanup() {
        if (resourceHandle != 0) {
            releaseNativeResource(resourceHandle);
            resourceHandle = 0;
        }
    }

    public static void main(String[] args) {
        ResourceHolderFinally holder = null;
        try {
            holder = new ResourceHolderFinally();
            holder.useResource();
        } finally {
            if (holder != null) {
                holder.cleanup();
            }
        }
    }
}
