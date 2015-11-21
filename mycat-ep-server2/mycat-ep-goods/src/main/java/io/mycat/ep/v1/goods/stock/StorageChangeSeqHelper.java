// **********************************************************************
//
// Copyright (c) 2003-2015 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.6.0
//
// <auto-generated>
//
// Generated from file `goods.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package io.mycat.ep.v1.goods.stock;

public final class StorageChangeSeqHelper
{
    public static void
    write(IceInternal.BasicStream __os, StorageChange[] __v)
    {
        if(__v == null)
        {
            __os.writeSize(0);
        }
        else
        {
            __os.writeSize(__v.length);
            for(int __i0 = 0; __i0 < __v.length; __i0++)
            {
                StorageChange.__write(__os, __v[__i0]);
            }
        }
    }

    public static StorageChange[]
    read(IceInternal.BasicStream __is)
    {
        StorageChange[] __v;
        final int __len0 = __is.readAndCheckSeqSize(21);
        __v = new StorageChange[__len0];
        for(int __i0 = 0; __i0 < __len0; __i0++)
        {
            __v[__i0] = StorageChange.__read(__is, __v[__i0]);
        }
        return __v;
    }
}