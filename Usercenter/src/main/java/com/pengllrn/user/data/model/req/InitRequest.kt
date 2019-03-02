package com.pengllrn.user.data.model.req

import com.pengllrn.base.common.BaseConstant
import com.pengllrn.base.network.protocal.BaseCallback
import com.pengllrn.base.network.protocal.BaseRequest

/**
 * 初始化请求。对应服务器接口：/init
 * Author：Pengllrn
 * Date: 2019/3/2
 */
class InitRequest :BaseRequest{
    companion object {
        private val URL = BaseConstant.BASE_URL + "/init"
    }
    override fun url(): String {
        return URL
    }

    override fun method(): Int {
        return BaseRequest.GET
    }

    override fun listen(baseCallback: BaseCallback?) {
        setListener(baseCallback)
        inFlight()
    }

}