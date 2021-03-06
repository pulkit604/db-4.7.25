/*-
 * See the file LICENSE for redistribution information.
 *
 * Copyright (c) 1997,2008 Oracle.  All rights reserved.
 *
 * $Id: RepRemoteHost.java,v 1.2 2008/01/08 20:58:32 bostic Exp $
 */

package db.repquote;

import com.sleepycat.db.ReplicationHostAddress;

public class RepRemoteHost{
    private ReplicationHostAddress addr;
    private boolean isPeer;

    public RepRemoteHost(ReplicationHostAddress remoteAddr, boolean hostIsPeer){
	addr = remoteAddr;
	isPeer = hostIsPeer;
    }

    public ReplicationHostAddress getAddress(){
	return addr;
    }

    public boolean isPeer(){
	return isPeer;
    }
}
