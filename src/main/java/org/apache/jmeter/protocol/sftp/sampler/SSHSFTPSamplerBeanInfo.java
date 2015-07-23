package org.apache.jmeter.protocol.sftp.sampler;

import java.beans.PropertyDescriptor;

public class SSHSFTPSamplerBeanInfo extends AbstractSSHSamplerBeanInfo {

    public SSHSFTPSamplerBeanInfo() {
        
        super(SSHSFTPSampler.class);
        
        createPropertyGroup("fileTransfer", new String[]{
                    "action", // $NON-NLS-1$
                    "source", // $NON-NLS-1$
                    "printFile",// $NON-NLS-1$
                    "destination" // $NON-NLS-1$
//
                });
//
        PropertyDescriptor p = property("action"); // $NON-NLS-1$
        p.setValue(NOT_UNDEFINED, Boolean.TRUE);
        p.setValue(NOT_OTHER, Boolean.TRUE);
        p.setValue(DEFAULT, "put");
        p.setValue(TAGS, new String[]{
            SSHSFTPSampler.SFTP_COMMAND_GET,
            SSHSFTPSampler.SFTP_COMMAND_PUT,
            SSHSFTPSampler.SFTP_COMMAND_RM,
            SSHSFTPSampler.SFTP_COMMAND_RMDIR,
            SSHSFTPSampler.SFTP_COMMAND_LS
        });
//
        p = property("source"); // $NON-NLS-1$
        p.setValue(NOT_UNDEFINED, Boolean.TRUE);
        p.setValue(DEFAULT, "");
//
        p = property("printFile"); // $NON-NLS-1$
        p.setValue(NOT_UNDEFINED, Boolean.TRUE);
        p.setValue(DEFAULT, Boolean.TRUE);
//
        p = property("destination"); // $NON-NLS-1$
        p.setValue(NOT_UNDEFINED, Boolean.TRUE);
        p.setValue(DEFAULT, "");
//
        
        
    }
    
}
