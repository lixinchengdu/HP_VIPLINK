//  (c) Copyright 2013 Hewlett-Packard Development Company, L.P.
//  Autogenerated
package com.netlab.viplink.rs;

import org.apache.felix.scr.annotations.Component;

import com.hp.sdn.adm.rsdoc.SelfRegisteringRSDocProvider;

/**
 * Self-registering REST API documentation provider.
 */
@Component
public class DocProvider extends SelfRegisteringRSDocProvider {
    
    public DocProvider() {
        super("VIP", "rsdoc", DocProvider.class.getClassLoader());
    }

}
