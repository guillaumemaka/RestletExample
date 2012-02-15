package com.restletexample;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.core.Application;


public class RestletApplication extends Application {
	public RestletApplication() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Set<Class<?>> getClasses() {
        Set<Class<?>> rrcs = new HashSet<Class<?>>();
        rrcs.add(RootResource.class);
        return rrcs;
    }
}
