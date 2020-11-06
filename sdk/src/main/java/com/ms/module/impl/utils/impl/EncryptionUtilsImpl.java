package com.ms.module.impl.utils.impl;

import com.ms.module.supers.inter.utils.IEncryptionUtilsAdapter;
import com.ms.module.supers.inter.utils.IMD5Utils;
import com.ms.module.supers.inter.utils.IRsaUtils;
import com.ms.module.supers.inter.utils.ISHAUtils;
import com.ms.module.supers.inter.utils.IStringUtils;

public class EncryptionUtilsImpl extends IEncryptionUtilsAdapter {


    public EncryptionUtilsImpl() {
        super();
    }

    @Override
    public IStringUtils getStringUtils() {
        return super.getStringUtils();
    }

    @Override
    public IMD5Utils getMD5Utils() {
        return super.getMD5Utils();
    }

    @Override
    public IRsaUtils getRsaUtils() {
        return super.getRsaUtils();
    }

    @Override
    public ISHAUtils getSHAUtils() {
        return super.getSHAUtils();
    }
}

