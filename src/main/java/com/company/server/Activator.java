package com.company.server;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {
    private static BundleContext m_context;

    public static BundleContext getContext() {
        return m_context;
    }

    public void start(BundleContext context) throws Exception {
        m_context = context;
        System.out.println("_START_");
    }

    public void stop(BundleContext context) throws Exception {
        System.out.println("__STOP__");
    }
}