package com.melinkr.ice.request;

import com.melinkr.ice.annotation.Temporary;
import com.melinkr.ice.context.IceRequestContext;

/**
 * <pre>
 *    ICE服务的请求对象，请求方法的入参必须是继承于该类。
 * </pre>
 *
 * @version 1.0
 */
public abstract class AbstracetIceRequest implements IceRequest {

    @Temporary
    private IceRequestContext iceRequestContext;

    @Override
    public IceRequestContext getIceRequestContext() {
        return iceRequestContext;
    }
    @Override
    public void setIceRequestContext(IceRequestContext iceRequestContext) {
        this.iceRequestContext = iceRequestContext;
    }
}
